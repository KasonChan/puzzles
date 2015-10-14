package S99

/**
 * Created by kasonchan on 10/14/15.
 */
object S9 extends App {

  //  9 Problem 9
  //  (**) Pack consecutive duplicates of list elements into sublists. If a list
  //  contains repeated elements they should be placed in separate sublists.
  //  Example:
  //  (pack '(a a a a b c c a a d e e e e))
  //  ((A A A A) (B) (C C) (A A) (D) (E E E E))
  //  Example in Haskell:
  //  Main> pack ['a', 'a', 'a', 'a', 'b', 'c', 'c', 'a',
  //  'a', 'd', 'e', 'e', 'e', 'e']
  //  ["aaaa","b","cc","aa","d","eeee"]

  val l1 = List()
  val l2 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  println(pack(l1))
  println(pack(l2))

  def pack[T](s: List[T]): List[List[T]] = {
    if (s.isEmpty) List(List())
    else {
      val (packed, next) = s span {
        _ == s.head
      }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

}
