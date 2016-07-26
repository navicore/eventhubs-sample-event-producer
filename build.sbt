name         := "eventhubs-sample-event-producer"
version      := "1.0"
organization := "hdinsight"

scalaVersion := "2.10.4"
val sparkVersion = "1.6.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided"
libraryDependencies += "com.microsoft.eventhubs.client" % "eventhubs-client" % "1.0"
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.6"
libraryDependencies += "junit" % "junit" % "4.8.2"

resolvers += Resolver.mavenLocal

mainClass in assembly := Some("com.microsoft.eventhubs.client.example.EventhubsClientDriver")
assemblyJarName in assembly := "EventhubsClientDriver.jar"

