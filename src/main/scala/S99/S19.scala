package S99

/**
 * Created by kasonchan on 10/22/15.
 */
object S19 extends App {

  //  9 Problem 19
  //  (**) Rotate a list N places to the left.
  //    Hint: Use the predefined functions length and (++).
  //  Examples:
  //  (rotate '(a b c d e f g h) 3)
  //  (D E F G H A B C)
  //  (rotate '(a b c d e f g h) -2)
  //  (G H A B C D E F)
  //  Examples in Haskell:
  //  rotate ['a','b','c','d','e','f','g','h'] 3
  //  "defghabc"
  //  rotate ['a','b','c','d','e','f','g','h'] (-2)
  //  "ghabcdef"

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def rotate[T](l: List[T], n: Int): List[T] = {
    val nBounded = if (l.isEmpty) 0 else n % l.length
    if (nBounded < 0) rotate(l, nBounded + l.length)
    else (l drop nBounded) ::: (l take nBounded)
  }

  println(rotate(l1, 3))
  println(rotate(l1, -2))
  println(rotate(l2, 3))
  println(rotate(l2, -2))

}
