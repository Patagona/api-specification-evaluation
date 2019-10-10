import java.io.{BufferedWriter, File, FileWriter}

import com.github.andyglow.json.JsonFormatter
import com.github.andyglow.jsonschema.AsValue
import json._
import json.schema.Version.Draft04

import scala.reflect.runtime.universe.{typeOf, TypeTag}

object Main {
  def main(args: Array[String]): Unit = {
    implicit val shopIntegrationStartSyncShopJob: Schema[Job.ShopIntegrationStartSyncShopJob] = Json.schema[Job.ShopIntegrationStartSyncShopJob]
    implicit val job: Schema[Job] = Json.schema[Job]
    //    implicit val jobTrait2: Schema[JobTrait2] = Json.schema[JobTrait2]
    implicit val jobTrait: Schema[JobTrait] = Json.schema[JobTrait]

    //  implicit val shopIntegrationStartSyncShopJob2: Schema[JobTrait.ShopIntegrationStartSyncShopJob2] = Json.schema[JobTrait.ShopIntegrationStartSyncShopJob2]
    //println(JsonFormatter.format(AsValue.schema(shopIntegrationStartSyncShopJob, Draft04())))
    println(JsonFormatter.format(AsValue.schema(shopIntegrationStartSyncShopJob, Draft04())))
    //writeSchema[ShopIntegrationStartSyncShopJob](Json.schema[ShopIntegrationStartSyncShopJob])
    //writeSchema[ShopIntegrationStartSyncShopJob2](Json.schema[ShopIntegrationStartSyncShopJob2])
    //writeSchema[ShopIntegrationStartSyncShopJob3](Json.schema[ShopIntegrationStartSyncShopJob3])

    /*
    implicit val genderSchema: json.Schema[Gender] = Json.schema[Gender]

    implicit val companySchema: json.Schema[Company] = Json.schema[Company]

    implicit val carSchema: json.Schema[Car] = Json.schema[Car]

    implicit val personSchema: json.Schema[Person] = Json.schema[Person]

    println(JsonFormatter.format(AsValue.schema(personSchema, Draft04())))
     */
  }

  def writeSchema[T: TypeTag](schema: json.Schema[T], outFolder: String = "schemas/"): Unit = {
    val className = name[T]
    val jsonFileName = outFolder + sanitizeFilename(s"$className.json")

    println(s"Writing JSON schema to: $jsonFileName")

    val file = new File(jsonFileName)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(JsonFormatter.format(AsValue.schema(schema, Draft04(description = Some(className)))))
    bw.close()
  }

  private def name[T: TypeTag] = typeOf[T].typeSymbol.name.toString

  private def sanitizeFilename(name: String) = name.replace("$", "")
}
