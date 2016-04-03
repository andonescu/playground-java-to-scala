package scala.day1

/**
  * Created by Ionut on 10.03.2016.
  */
case class Student(firstName: String, lastName: String, address: Address)

object StudentProcessor {

  /**
    * Simple solution but not so efficient is to filter each time after a specific condition
    */
  def getStudentByOriginCountry_01(students: Set[Student]): (Set[Student], Set[Student]) = {

    def isCountryRomania: (Student) => Boolean =
      _.address.country.equals("Romania")


    (students.filter(isCountryRomania), students.filterNot(isCountryRomania))
  }


  /**
    * Best Solution is to write your proper methods to do this
    */
  def getStudentByOriginCountry_02(students: Set[Student]): (Set[Student], Set[Student]) = {

    def isCountryRomania: (Student) => Boolean =
      _.address.country.equals("Romania")

    def extract(students: Seq[Student],
                romaniaGroup: Set[Student] = Set.empty,
                otherGroup: Set[Student] = Set.empty): (Set[Student], Set[Student]) =
      students match {
        case x :: xs if isCountryRomania(x) => extract(xs, romaniaGroup + x, otherGroup)
        case x :: xs if !isCountryRomania(x) => extract(xs, romaniaGroup, otherGroup + x)
        case Nil => (romaniaGroup, otherGroup)
      }


    extract(students.toSeq)
  }


  /**
    * Or to use partition from [[scala.collection.TraversableLike]] trait
    */
  def getStudentByOriginCountry_03(students: Set[Student]): (Set[Student], Set[Student]) = {

    def isCountryRomania: (Student) => Boolean =
      _.address.country.equals("Romania")

    students.partition(isCountryRomania)
  }
}