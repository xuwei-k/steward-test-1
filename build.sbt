scalaVersion := "2.13.12"

crossScalaVersions += "3.3.1"

scalafixDependencies ++= {
  scalaBinaryVersion.value match {
    case "3" =>
      Nil
    case _ =>
      Seq("com.github.xuwei-k" %% "scalafix-rules" % "0.3.4")
  }
}
