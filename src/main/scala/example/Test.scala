package example
import simulacrum._

@typeclass
trait TC[A]

object TC {
  implicit val stingTC: TC[String] = null
}


object Test {
  val c = TC[String] //fails on `sbt doc` on 2.13.0-M4
}
