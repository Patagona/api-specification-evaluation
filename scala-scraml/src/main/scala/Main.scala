import de.patagona.schema.{Execution, ShopIntegrationUpdateProductJob}
object Main extends App {
  val job1 = ShopIntegrationUpdateProductJob("abc", "cdc")
  val job2 = Execution("yeah", "yeah", "yeah", "yeah", "yeah", success = true)
  println(job1)
  println(job2)
}
