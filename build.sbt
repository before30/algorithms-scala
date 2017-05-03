lazy val root = (project in file("."))
    .settings(
        name         := "algorithms",
        scalaVersion := "2.11.8"
    )

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)