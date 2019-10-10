/**
 * patagona-scheduler
 * This API wraps the [dKron](https://dkron.io/v1.2/api/#/) scheduling service and provides an easier interface/isolation.  **Note:** The actions which can be scheduled on a specific component are defined in the `patagona-scheduler`. Scheduling actions unknown to the `patagona-scheduler` will result in errors. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


import com.wordnik.client.api._
import akka.actor.ActorSystem
import io.swagger.app.{ResourcesApp, SwaggerApp}
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    implicit val system = ActorSystem("appActorSystem")
    try {
      context mount (new DefaultApi, "//Default/*")
      
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}