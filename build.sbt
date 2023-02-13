ThisBuild / version := "1.0.0"
ThisBuild / description := "Typesafe Scala.js"
ThisBuild / scalaVersion := "3.2.1"

ThisBuild / semanticdbEnabled := true
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.6.0"

ThisBuild / scalacOptions ++= Seq(
  "-Werror",
  "-deprecation",
  "-feature",
  "-unchecked"
)

lazy val core = project
  .in(file("core"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "typesafe-scalajs-core",
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "cats-effect" % "3.4.4"
    )
  )

lazy val dom = project
  .in(file("dom"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(core)
  .settings(
    name := "typesafe-scalajs-dom",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.1.0"
    )
  )

lazy val renderer = project
  .in(file("renderer"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(dom)
  .settings(
    name := "typesafe-scalajs-renderer"
  )

lazy val app = project
  .in(file("app"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(renderer)
  .settings(
    name := "typesafe-scalajs-app"
  )

lazy val examples = project
  .in(file("examples"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(app)
  .settings(
    name := "typesafe-scalajs-examples",
    scalaJSUseMainModuleInitializer := true
  )
