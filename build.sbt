name := "ScalaOnMac"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.1.0"

// %% tells it to resolve the spark version using scala version?
// You don't have to resolve all the other child dependencies.

resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

libraryDependencies ++= Seq(
  "org.apache.spark"       %% "spark-core"                % sparkVersion,
  "org.apache.spark"       %% "spark-sql"                 % sparkVersion,
  "org.apache.spark"       %% "spark-graphx"              % sparkVersion,
  "org.scalacheck"         %% "scalacheck"                % "1.13.4" % Test,
  "org.scalatest"          %% "scalatest"                 % "3.0.1"  % Test,
  "org.apache.spark"       %% "spark-hive"                % sparkVersion,
  "org.apache.spark"        % "spark-mllib_2.11"          % "2.1.0",
  //"org.apache.spark"       %% "spark-mlib"                % sparkVersion,
  "org.apache.spark"       %% "spark-streaming"           % sparkVersion
  //"org.apache.spark"       %% "spark-streaming-kafka"     % sparkVersion
)
libraryDependencies += "graphframes" % "graphframes" % "0.3.0-spark2.0-s_2.10"
