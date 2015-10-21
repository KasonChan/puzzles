package S99

/**
 * Created by kasonchan on 10/21/15.
 */
object S15 extends App {

  //  5 Problem 15
  //  (**) Replicate the elements of a list a given number of times.
  //  Example:
  //  (repli '(a b c) 3)
  //  (A A A B B B C C C)
  //  Example in Haskell:
  //  repli "abc" 3
  //  "aaabbbccc"

  def repli[T](l: List[T], n: Int): List[T] = l flatMap { e => List.fill(n)(e) }

  println(repli(List(1, 2, 3), 3))

}
