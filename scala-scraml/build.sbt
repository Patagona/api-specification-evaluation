name := "scala-scraml"

version := "0.1"

scalaVersion := "2.11.1"


//scramlRamlApi in scraml in Compile := "api-definition/raml/api.raml"
//scramlLanguage in scraml in Compile := "TypeScript"
//scramlApiPackage in scraml in Compile := "de.patagona.scheduler"
//scramlDestinationDir in scraml in Compile := file("typescript")
//scramlSingleSourceFile in scraml in Compile := "types.d.ts"

scramlRamlApi in scraml in Compile := "api-definition/raml/api.raml"
scramlLanguage in scraml in Compile := "scala"
scramlApiPackage in scraml in Compile := "de.patagona.scheduler"

libraryDependencies ++= Seq(
  "com.ning" % "async-http-client" % "1.9.40",
  "com.typesafe.play" %% "play-json" % "2.5.14"
)
