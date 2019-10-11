name := "scala-tsi"

version := "0.1"

scalaVersion := "2.12.8"




lazy val root = (project in file("."))
  .settings(
    typescriptClassesToGenerateFor := Seq("Job"),
    typescriptGenerationImports := Seq("de.patagona._", "de.patagona.MyModelTSTypes._"),
    typescriptOutputFile := baseDirectory.value / "model.ts"
  )