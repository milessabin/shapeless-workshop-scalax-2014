scalaVersion := "2.11.4"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  //"com.chuusai" %% "shapeless" % "2.0.0"
  "com.chuusai" %% "shapeless" % "2.1.0-SNAPSHOT"
)

initialCommands in console := """import shapeless._, workshop._, WorkshopDefns._"""
