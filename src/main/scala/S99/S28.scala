package S99

import S99.S10.encode

/**
 * Created by ka-son on 10/25/15.
 */
object S28 extends App {

  //  8 Problem 28
  //  Sorting a list of lists according to length of sublists
  //  a) We suppose that a list contains elements that are lists themselves.
  //  The objective is to sort the elements of this list according to their length. E.g. short lists first, longer lists later, or vice versa.
  //  Example:
  //  (lsort '((a b c) (d e) (f g h) (d e) (i j k l) (m n) (o)))
  //  ((O) (D E) (D E) (M N) (A B C) (F G H) (I J K L))
  //  Example in Haskell:
  //  lsort ["abc","de","fgh","de","ijkl","mn","o"]
  //  ["o","de","de","mn","abc","fgh","ijkl"]
  //  b) Again, we suppose that a list contains elements that are lists
  //  themselves. But this time the objective is to sort the elements of this
  //  list according to their length frequency; i.e., in the default, where
  //  sorting is done ascendingly, lists with rare lengths are placed first,
  //  others with a more frequent length come later.
  //  Example:
  //  (lfsort '((a b c) (d e) (f g h) (d e) (i j k l) (m n) (o)))
  //  ((i j k l) (o) (a b c) (f g h) (d e) (d e) (m n))
  //  Example in Haskell:
  //  lfsort ["abc", "de", "fgh", "de", "ijkl", "mn", "o"]
  //  ["ijkl","o","abc","fgh","de","de","mn"]

  val l1 = List()
  val l2 = List(List("a", "b", "c"),
    List("d", "e"),
    List("f", "g", "h"),
    List("d", "e"),
    List("i", "j", "k", "l"),
    List("m", "n"),
    List("o"))

  def lsort[T](l: List[List[T]]): List[List[T]] = {
    l.sortWith(_.length < _.length)
  }

  def lfsort[T](l: List[List[T]]): List[List[T]] = {
    val freqs = Map(encode(l map (_.length) sortWith (_ < _)).getOrElse(List()).map(_.swap): _*)
    l sortWith ((e1, e2) => freqs(e1.length) < freqs(e2.length))
  }

  println(lsort(l1))
  println(lsort(l2))

  println(lfsort(l1))
  println(lfsort(l2))

}
