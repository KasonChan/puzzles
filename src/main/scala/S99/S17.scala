package S99

/**
 * Created by kasonchan on 10/22/15.
 */
object S17 extends App {

  //  7 Problem 17
  //  (*) Split a list into two parts; the length of the first part is given.
  //  Do not use any predefined predicates.
  //  Example:
  //  (split '(a b c d e f g h i k) 3)
  //  ( (A B C) (D E F G H I K))
  //  Example in Haskell:
  //  Main> split "abcdefghik" 3
  //  ("abc", "defghik")

  def split[T](l: List[T], n: Int): Option[(List[T], List[T])] = {
    l.isEmpty match {
      case true => None
      case false =>
        if (n <= l.length) Some(l.slice(0, n), l.slice(n, l.length))
        else None
    }
  }

  def split2[T](l: List[T], n: Int): (List[T], List[T]) = {
    (l.take(n), l.drop(n))
  }

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  println(split(l1, 3))
  println(split(l2, 3))
  println(split(l2, 9))
  println(split(l2, 10))
  println(split(l2, 11))
  println(split(l2, 12))

  println(split2(l1, 3))
  println(split2(l2, 3))
  println(split2(l2, 9))
  println(split2(l2, 10))
  println(split2(l2, 11))
  println(split2(l2, 12))

}
