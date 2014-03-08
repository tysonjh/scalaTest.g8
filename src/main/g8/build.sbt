name := "$name$"

version := "$g8_project_version$"

scalaVersion := "$g8_scala_version$"

organization := "$g8_organization$"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.0" % "test"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions")

parallelExecution in Test := false
