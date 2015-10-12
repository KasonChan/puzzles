package S99

/**
 * Created by kasonchan on 10/12/15.
 */
object S4 {

  //  4 Problem 4
  //  (*) Find the number of elements of a list.
  //  Example in Haskell:
  //  Prelude> myLength [123, 456, 789]
  //  3
  //  Prelude> myLength "Hello, world!"
  //  13

  def main(args: Array[String]) {
    val l1 = List(123, 456, 789)
    val l2 = "Hello, world!"

    println(myLength(l1))
    println(myLength(l2))
    println(myLength2(l1))
    println(myLength2(l2))
  }

  def myLength[T](l: Seq[T]): Int = l.length

  def myLength2[T](l: Seq[T]): Int = l.foldLeft(0) { (c, _) => c + 1 }

}
