import scala.util.{Failure, Success, Try}

def divide(x: String, y: String): Try[Int] = {
  val dividend = Try(x.toInt)
  val divisor = Try(y.toInt)
  dividend.flatMap(x => divisor.map(y => x / y))
}

val result = divide("2", "4")

result match {
  case Success(v) =>
    println("Result is " + v)
  case Failure(e) =>
    println("You must've divided by zero or entered something that's not an Int. Try again!")
    println("Info from the exception: " + e.getMessage)
}




