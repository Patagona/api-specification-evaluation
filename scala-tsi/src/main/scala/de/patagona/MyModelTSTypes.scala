package de.patagona

import nl.codestar.scalatsi._

// A TSType[T] is what tells scala-tsi how to convert your type T into typescript
// MyModelTSTypes contains all TSType[_]'s for your model
// You can also spread these throughout your codebase, for example in the same place where your JSON (de)serializers
object MyModelTSTypes extends DefaultTSTypes {
  implicit val tsJob = TSType.fromCaseClass[Job]
}