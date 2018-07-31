import Dependencies._

lazy val root = project.in(file(".")).
  settings(scalaVersion := "2.13.0-M4",
    scalacOptions += "-Ymacro-annotations",
    //  scalaVersion := "2.12.6",
    //  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
    scalacOptions += "-language:experimental.macros",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided",
      "com.github.mpilquist" %% "simulacrum"    % "0.13.0"
    ))

