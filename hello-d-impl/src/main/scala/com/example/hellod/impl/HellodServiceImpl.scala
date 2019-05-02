package com.example.hellod.impl

import com.example.hellod.api
import com.example.hellod.api.HellodService
import com.lightbend.lagom.scaladsl.api.ServiceCall
import com.lightbend.lagom.scaladsl.api.broker.Topic
import com.lightbend.lagom.scaladsl.broker.TopicProducer
import com.lightbend.lagom.scaladsl.persistence.{EventStreamElement, PersistentEntityRegistry}

/**
  * Implementation of the HellodService.
  */
class HellodServiceImpl(persistentEntityRegistry: PersistentEntityRegistry) extends HellodService {

  override def hello(id: String) = ServiceCall { _ =>
    // Look up the hello-d entity for the given ID.
    val ref = persistentEntityRegistry.refFor[HellodEntity](id)

    // Ask the entity the Hello command.
    ref.ask(Hello(id))
  }

  override def useGreeting(id: String) = ServiceCall { request =>
    // Look up the hello-d entity for the given ID.
    val ref = persistentEntityRegistry.refFor[HellodEntity](id)

    // Tell the entity to use the greeting message specified.
    ref.ask(UseGreetingMessage(request.message))
  }


  override def greetingsTopic(): Topic[api.GreetingMessageChanged] =
    TopicProducer.singleStreamWithOffset {
      fromOffset =>
        persistentEntityRegistry.eventStream(HellodEvent.Tag, fromOffset)
          .map(ev => (convertEvent(ev), ev.offset))
    }

  private def convertEvent(helloEvent: EventStreamElement[HellodEvent]): api.GreetingMessageChanged = {
    println(helloEvent)
    helloEvent.event match {
      case GreetingMessageChanged(msg) => api.GreetingMessageChanged(helloEvent.entityId, msg)
    }
  }
}
