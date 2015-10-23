package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S26 extends App {

  //  6 Problem 26
  //  (**) Generate the combinations of K distinct objects chosen from the
  //  N elements of a list
  //  In how many ways can a committee of 3 be chosen from a group of 12 people?
  //  We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
  //  well-known binomial coefficients). For pure mathematicians, this result
  //  may be great. But we want to really generate all the possibilities in a list.
  //  Example:
  //  (combinations 3 '(a b c d e f))
  //  ((A B C) (A B D) (A B E) ... )
  //  Example in Haskell:
  //  combinations 3 "abcdef"
  //  ["abc","abd","abe",...]

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def flatMapSublists[T, U](l: List[T])(f: (List[T]) => List[U]): List[U] =
    l match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }

  def combinations[T](l: List[T], n: Int): List[List[T]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(l) { sl =>
      combinations(sl.tail, n - 1) map {
        sl.head :: _
      }
    }
  }

  println(combinations(l1, 3))
  println(combinations(l2, 3))

}
