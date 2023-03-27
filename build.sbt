ThisBuild / version := "1.0.0"
ThisBuild / description := "Typesafe Scala.js"
ThisBuild / scalaVersion := "3.2.1"
ThisBuild / licenses := List("MIT" -> new URL("https://opensource.org/license/mit/"))
ThisBuild / homepage := Some(url("https://github.com/stouma915/typesafe-scalajs"))
ThisBuild / developers := List(
  Developer(
    id = "stouma915",
    name = "Sasaki Touma",
    email = "netst915@gmail.com",
    url = url("https://st915.net")
  )
)

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
    name := "typesafe-scalajs"
  )

lazy val examples = project
  .in(file("examples"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(app)
  .settings(
    name := "typesafe-scalajs-examples",
    scalaJSUseMainModuleInitializer := true
  )

ThisBuild / organization := "net.st915"
ThisBuild / organizationName := "st915"
ThisBuild / organizationHomepage := Some(url("https://st915.net"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/stouma915/typesafe-scalajs"),
    "scm:git@github.stouma915/typesafe-scalajs.git"
  )
)

ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true
