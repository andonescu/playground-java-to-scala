package scala.day2

/**
  * Created by Ionut on 31.03.2016.
  */
object PlayingWithInts {
  def main(args: Array[String]) {

    val data = Seq(
      Seq(1, 2, 3),
      Seq(3, 5),
      Seq(7, 3, 10),
      Seq(3, 5, 6)
    )

    // if isIntersection is `false` then we do union
    val isIntersection: Boolean = Math.random > 0.5


    // solution
    val aggregation = (first: Seq[Int], second: Seq[Int]) => if (isIntersection) first.intersect(second)
    else first.union(second)


    println(data.reduce(aggregation).toSet)

  }

}
