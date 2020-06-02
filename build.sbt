name := "sbtest"

version := "0.1"

scalaVersion := "2.12.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5" % "provided", // I believe these needs the provided bit as the cluster is preloaded with spark?
  "org.apache.spark" %% "spark-sql" % "2.4.5" %  "provided",
)

