import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "SparkDemo",
	
	libraryDependencies += scalaTest % Test,
	
	libraryDependencies ++= Seq(
		"org.apache.spark" %% "spark-core" % "2.1.1",
		"org.apache.spark" %% "spark-sql" % "2.1.1"
	)
  )
