package S99

import S99.S10.encode

/**
 * Created by kasonchan on 10/14/15.
 */
object S11 extends App {

  //  1 Problem 11
  //  (*) Modified run-length encoding.
  //  Modify the result of problem 10 in such a way that if an element has no
  //  duplicates it is simply copied into the result list. Only elements with
  //  duplicates are transferred as (N E) lists.
  //  Example:
  //  (encode-modified '(a a a a b c c a a d e e e e))
  //  ((4 A) B (2 C) (2 A) D (4 E))
  //  Example in Haskell:
  //  P11> encodeModified "aaaabccaadeeee"
  //  [Multiple 4 'a',Single 'b',Multiple 2 'c',
  //  Multiple 2 'a',Single 'd',Multiple 4 'e']

  def encodeModified[T](s: List[T]): Option[List[Either[T, (Int, T)]]] =
    encode(s) match {
      case None => None
      case Some(x) => Some(x map { t => if (t._1 == 1) Left(t._2) else Right(t) })
    }

  val l1 = List()
  val l2 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  println(encodeModified(l1).getOrElse(List()))
  println(encodeModified(l2).getOrElse(List()))

}
