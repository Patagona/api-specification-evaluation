import fi.oph.scalaschema._
import fi.oph.scalaschema.annotation.Description
import org.json4s.JsonAST.JValue
import org.json4s.jackson.JsonMethods

object ExampleApp extends App {
  val schema: Schema = SchemaFactory.default.createSchema[Container]
  val schemaAsJson: JValue = schema.toJson
  val schemaAsString = JsonMethods.pretty(schemaAsJson)
  println(schemaAsString)
}

sealed trait Animal {
  val name: String;
}

case class Cat(override val name: String, @Description("The cat name") isNice: Boolean = true) extends Animal

case class Dog(override val name: String, @Description("The dog name") breed: String) extends Animal

case class Container(cat: Cat, dog: Dog)