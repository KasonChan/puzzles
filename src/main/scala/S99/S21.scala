package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S21 extends App {

  //  1 Problem 21
  //  Insert an element at a given position into a list.
  //  Example:
  //  (insert-at 'alfa '(a b c d) 2)
  //  (A ALFA B C D)
  //  Example in Haskell:
  //  insertAt 'X' "abcd" 2
  //  "aXbcd"

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def insertAt[T](l: List[T], x: T, i: Int): List[T] = {
    l splitAt (i) match {
      case (init, tail) => init ::: x :: tail
    }
  }

  println(insertAt(l1, 'X', 2))
  println(insertAt(l2, 'X', 2))

}
