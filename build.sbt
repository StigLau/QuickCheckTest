import sbt._
import Process._
import Keys._

name := "ScalaCheck"

version := "1.0"

scalaVersion := "2.11.0-RC4"

resolvers += "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"

libraryDependencies += "org.apache.commons" % "commons-collections4" % "4.0"


