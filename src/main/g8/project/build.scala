import sbt._
import sbt.Keys._

object SimplexTestBuild extends Build {

  lazy val simplexTest = Project(
    id = "SimplexTest",
    base = file("."),
    settings = Project.defaultSettings ++ Common.lwjglSettings ++ Seq(
      name := "Simplex3D test project",
      organization := "org.example",
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
