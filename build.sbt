scalaVersion := "2.13.12"

crossScalaVersions += "3.3.0"

scalafixDependencies += "com.github.xuwei-k" %% "scalafix-rules" % "0.3.3" cross CrossVersion.for3Use2_13
