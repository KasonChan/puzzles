package S99

/**
 * Created by kasonchan on 10/22/15.
 */
object S18 extends App {

  //  8 Problem 18
  //  (**) Extract a slice from a list.
  //  Given two indices, i and k, the slice is the list containing the elements
  //  between the i'th and k'th element of the original list (both limits
  //  included). Start counting the elements with 1.
  //  Example:
  //  (slice '(a b c d e f g h i k) 3 7)
  //  (C D E F G)
  //  Example in Haskell:
  //  Main> slice ['a','b','c','d','e','f','g','h','i','k'] 3 7
  //  "cdefg"

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def slice[T](l: List[T], b: Int, e: Int): List[T] = l.slice(b - 1, e)

  def slice2[T](l: List[T], b: Int, e: Int): List[T] = l.slice(b - 1, b + (e - (b max 0)))


  println(slice(l1, 0, 100))
  println(slice(l1, 3, 7))
  println(slice(l2, 0, 100))
  println(slice(l2, 3, 7))

  println(slice2(l1, -1, 100))
  println(slice2(l1, 3, 7))
  println(slice2(l2, -1, 100))
  println(slice2(l2, 3, 7))

}
