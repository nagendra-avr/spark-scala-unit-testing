name := "spark-scala-unit-testing"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.1",
  "org.apache.spark" %% "spark-sql" % "2.3.1",
  "org.apache.spark" %% "spark-hive" % "2.3.1" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1",
  "com.holdenkarau" %% "spark-testing-base" % "2.3.1_0.10.0" % "test"
)

parallelExecution in Test := false

fork in Test := true

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")