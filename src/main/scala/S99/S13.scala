package S99

/**
 * Created by kasonchan on 10/21/15.
 */
object S13 extends App {

  //  3 Problem 13
  //  (**) Run-length encoding of a list (direct solution).
  //  Implement the so-called run-length encoding data compression method directly. I.e. don't explicitly create the sublists containing the duplicates, as in problem 9, but only count them. As in problem P11, simplify the result list by replacing the singleton lists (1 X) by X.
  //  Example:
  //  (encode-direct '(a a a a b c c a a d e e e e))
  //  ((4 A) B (2 C) (2 A) D (4 E))
  //  Example in Haskell:
  //  encodeDirect "aaaabccaadeeee"
  //  [Multiple 4 'a',Single 'b',Multiple 2 'c',
  //  Multiple 2 'a',Single 'd',Multiple 4 'e']

  val l1 = List()
  val l2 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def encodeDirect[A](ls: List[A]): List[(Int, A)] =
    if (ls.isEmpty) Nil
    else {
      val (packed, next) = ls span {
        _ == ls.head
      }
      (packed.length, packed.head) :: encodeDirect(next)
    }

  println(encodeDirect(l1))
  println(encodeDirect(l2))

}
