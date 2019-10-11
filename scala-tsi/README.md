# [scala-tsi](https://github.com/code-star/scala-tsi/tree/master)
```shell script
sbt generateTypescript
```

## Converts
- Scala :arrow_right: TypeScript

## Problems
- Strange way to define which classes are converted
    - `MyModelTsTypes.scala`
        - ````scala
            package de.patagona
            
            import nl.codestar.scalatsi._
            
            // A TSType[T] is what tells scala-tsi how to convert your type T into typescript
            // MyModelTSTypes contains all TSType[_]'s for your model
            // You can also spread these throughout your codebase, for example in the same place where your JSON (de)serializers
            object MyModelTSTypes extends DefaultTSTypes {
              implicit val tsJob = TSType.fromCaseClass[Job]
            }
           ```
    - `build.sbt`
       - ```scala
            lazy val root = (project in file("."))
              .settings(
                typescriptClassesToGenerateFor := Seq("Job"),
                typescriptGenerationImports := Seq("de.patagona._", "de.patagona.MyModelTSTypes._"),
                typescriptOutputFile := baseDirectory.value / "model.ts"
              )
            ```
## Example
```typescript
export interface IJob {
  action: string
  component: string
  jobType: string
  retries?: number
  schedule: string
  uuid?: string
  abc: string
}
```