import com.example.ShopIntegrationStartSyncJob
import com.example.codec.CustomJsonProtocol._
import sjsonnew.support.scalajson.unsafe._

class Main extends App {
  println("yeah")

  val job = ShopIntegrationStartSyncJob("some name", 0)
  println(job)
  val j = Converter.toJsonUnsafe(job)
  val s = CompactPrinter(j)
  println(s)
}
