package scala

/**
  * Created by ionut on 4/8/16.
  */
object NumberToInfinite {
  def main(args: Array[String]) {
    def numberToInfinite(x: Int): Unit = {
      println(x)
      numberToInfinite(x + 1)
    }

    numberToInfinite(1)
  }
}
