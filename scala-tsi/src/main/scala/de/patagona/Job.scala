package de.patagona
import nl.codestar.scalatsi._

sealed trait JobTrait {
  val action: String
  val component: String
  val jobType: String
  val retries: Option[Int]
  val schedule: String
  val uuid: Option[String]
}

case class Job(
                action: String,
                component: String,
                jobType: String,
                retries: Option[Int],
                schedule: String,
                uuid: Option[String],
                abc: String
              ) extends JobTrait