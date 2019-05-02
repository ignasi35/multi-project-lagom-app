organization in ThisBuild := "com.example"
version in ThisBuild := "1.0-SNAPSHOT"

// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.12.8"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % Test

lazy val `hello` = (project in file("."))
  .aggregate(
    `hello-a-api`, `hello-a-impl`,
    `hello-b-api`, `hello-b-impl`,
    `hello-c-api`, `hello-c-impl`,
    `hello-d-api`, `hello-d-impl`,
    `hello-e-api`, `hello-e-impl`,
    `hello-f-api`, `hello-f-impl`,
    `hello-g-api`, `hello-g-impl`,
    `hello-h-api`, `hello-h-impl`,
    `hello-i-api`, `hello-i-impl`
    )

lazy val `hello-a-api` = (project in file("hello-a-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-a-impl` = (project in file("hello-a-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-a-api`)

lazy val `hello-b-api` = (project in file("hello-b-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-b-impl` = (project in file("hello-b-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-b-api`)

lazy val `hello-c-api` = (project in file("hello-c-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-c-impl` = (project in file("hello-c-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-c-api`)

lazy val `hello-d-api` = (project in file("hello-d-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-d-impl` = (project in file("hello-d-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-d-api`)

lazy val `hello-e-api` = (project in file("hello-e-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-e-impl` = (project in file("hello-e-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-e-api`)

lazy val `hello-f-api` = (project in file("hello-f-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-f-impl` = (project in file("hello-f-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-f-api`)

lazy val `hello-g-api` = (project in file("hello-g-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-g-impl` = (project in file("hello-g-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-g-api`)

lazy val `hello-h-api` = (project in file("hello-h-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-h-impl` = (project in file("hello-h-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-h-api`)

lazy val `hello-i-api` = (project in file("hello-i-api"))  .settings(    libraryDependencies ++= Seq(      lagomScaladslApi    )  )
lazy val `hello-i-impl` = (project in file("hello-i-impl"))  .enablePlugins(LagomScala)  .settings(    libraryDependencies ++= Seq(      lagomScaladslPersistenceCassandra,      lagomScaladslKafkaBroker,      lagomScaladslTestKit,      macwire,      scalaTest    )  )  .settings(lagomForkedTestSettings)  
.dependsOn(`hello-i-api`)
