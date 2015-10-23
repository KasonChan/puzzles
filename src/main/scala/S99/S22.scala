package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S22 extends App {

  //  2 Problem 22
  //  Create a list containing all integers within a given range.
  //  Example:
  //  (range 4 9)
  //  (4 5 6 7 8 9)
  //  Example in Haskell:
  //  range 4 9
  //  [4,5,6,7,8,9]

  def range(s: Int, e: Int): List[Int] = List.range(s, e + 1)

  println(range(4, 9))

}
