import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="Camel"$",
    base = file("."),
    settings = Project.defaultSettings ++ Common.lwjglSettings ++ Seq(
      name := "$name$",
      organization := "$package$",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "org.simplex3d" % "simplex3d-engine-vanilla_2.10" % "0.3.4",
      libraryDependencies += "org.simplex3d" % "simplex3d-algorithm-noise_2.10" % "0.4.6",
      libraryDependencies += "org.simplex3d" % "simplex3d-algorithm-mesh_2.10" % "0.4.6",
      libraryDependencies += "org.lwjgl.lwjgl" % "lwjgl" % "2.8.4"
    )
  )
}
