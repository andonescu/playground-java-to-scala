import scala.util.Random

class Request {

  def getParameter(name: String): Option[String] =
    Random.nextBoolean() match {
      case true =>
        Some(Random.alphanumeric.take(10).mkString(""))
      case false => None
    }
}

val request = new Request

val name: Option[String] = request getParameter "name"
val upper = name map { _.trim } filter { _.length != 0 } map { _.toUpperCase }
println(upper getOrElse "")