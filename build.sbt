ThisBuild / version := "1.0.0"
ThisBuild / description := "Typesafe scalajs-dom"
ThisBuild / scalaVersion := "3.2.1"

ThisBuild / semanticdbEnabled := true
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.6.0"

ThisBuild / scalacOptions ++= Seq(
  "-Werror",
  "-deprecation",
  "-feature",
  "-unchecked"
)

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "typesafe-scalajs-dom",
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "cats-effect" % "3.4.1",
      "org.scala-js" %%% "scalajs-dom" % "2.1.0",
      "org.scalatest" %%% "scalatest" % "3.2.10" % "test"
    )
  )
