sealed class Job(action: String,
                 component: String,
                 jobType: String,
                 retries: Option[Int],
                 schedule: String,
                 uuid: Option[String]) {
}

object Job {

  case class ShopIntegrationStartSyncShopJob(
                                              val action: String,
                                              val component: String,
                                              val jobType: String,
                                              val retries: Option[Int],
                                              val schedule: String,
                                              val uuid: Option[String]
                                            ) extends Job(action, component, jobType, retries, schedule, uuid) {
  }

}

sealed trait JobTrait {
  val action: String
  val component: String
  val jobType: String
  val retries: Option[Int]
  val schedule: String
  val uuid: Option[String]
}

sealed trait JobTrait2 extends JobTrait {
  val abc: String
}

object JobTrait {

  case class ShopIntegrationStartSyncShopJob2(
                                               action: String,
                                               component: String,
                                               jobType: String,
                                               retries: Option[Int],
                                               schedule: String,
                                               uuid: Option[String],
                                               abc: String
                                             ) extends JobTrait2 {
  }

}