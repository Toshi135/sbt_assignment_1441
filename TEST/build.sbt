name := "hello"
version:="1.0"
scalaVersion := "2.12.12"
lazy val persistence= project.in(file("persistence"))
  .settings(
    libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.2", "mysql" % "mysql-connector-java" % "8.0.18","org.scalatest" %% "scalatest" % "3.2.3" % Test,"com.h2database" % "h2" % "1.4.197" % Test,"org.mockito" %% "mockito-scala" % "1.16.13" % Test))
lazy val http= project.in(file("http"))
  .settings(
libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.1.13","com.typesafe.akka" %% "akka-actor" % "2.6.8","com.typesafe.akka" %% "akka-stream" % "2.6.9","com.typesafe.akka" %% "akka-http-testkit" % "10.1.12" % Test, "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.8" % Test,"com.typesafe.akka" %% "akka-stream-testkit" % "2.6.9" % Test))
lazy val root = project.in(file("root")).aggregate( persistence,http )

