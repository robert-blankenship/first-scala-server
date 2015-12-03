lazy val root = (project in file(".")).
	settings(
		name := "project",
		version := "0.1"
	)

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.3"
libraryDependencies += "io.spray" %% "spray-routing" % "1.3.3"
libraryDependencies += "io.spray" %% "spray-http" % "1.3.3"
libraryDependencies += "io.spray" %% "spray-can" % "1.3.3"
