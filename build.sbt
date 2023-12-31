ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "back-to-scala",
    libraryDependencies ++=
      Dependencies.org.http4s.all ++
        Dependencies.com.beachape.enumeratum.all ++
        Seq(
          Dependencies.ch.qos.logback,
          Dependencies.org.tpolecat.skunk.core,
        ),
  )
