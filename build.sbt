val specs2Version = "4.9.2"
val http4sVersion = "0.21.3"

lazy val specs2Http4s = (project in file("."))
  .settings(
    name := "specs2-http4s",
    organization := "org.specs2",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-matcher" % specs2Version,
      "org.specs2" %% "specs2-cats" % specs2Version,
      "org.http4s" %% "http4s-core" % http4sVersion,
      "org.specs2" %% "specs2-core" % specs2Version % Test
    )
  )
