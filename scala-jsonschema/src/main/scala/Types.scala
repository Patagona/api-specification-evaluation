sealed trait Gender

object Gender {

  case object Male extends Gender

  case object Female extends Gender

}

case class Company(name: String)

case class Car(name: String, manufacturer: Company)

sealed trait PersonTrait {
  val abc: String
}

case class Person(
                   firstName: String,
                   middleName: Option[String],
                   lastName: String,
                   gender: Gender,
                   birthDay: java.time.LocalDateTime,
                   company: Company,
                   cars: Seq[Car],
                   abc: String) extends PersonTrait