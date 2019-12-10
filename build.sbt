name := "RockitProject"
version := "0.2"
scalaVersion := "2.13.1"
scalacOptions += "-deprecation"

//lazy val akkaVersion = "maven(com.typesafe.akka, akka-actor_2.13, stable)"
lazy val akkaVersion = "maven(com.typesafe.akka, akka-actor_2.13, stable)"

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.1"
//libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.1"
//libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.1" % Test

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.1",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.1" % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
