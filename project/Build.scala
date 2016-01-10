import sbt._
import sbt.Keys._

object ScalaProjectBuild extends Build {
  lazy val test = Project(
    id = "test",
    base = file("."),
    settings =
      Seq(
        scalaVersion := "2.11.7",
        libraryDependencies ++= Seq("com.github.alexarchambault" %% "argonaut-shapeless_6.1" % "0.3.1")
      )
  )
}
