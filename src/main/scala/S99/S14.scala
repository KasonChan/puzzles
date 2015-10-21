package S99

/**
 * Created by kasonchan on 10/21/15.
 */
object S14 extends App {

  //  4 Problem 14
  //  (*) Duplicate the elements of a list.
  //  Example:
  //  (dupli '(a b c c d))
  //  (A A B B C C C C D D)
  //  Example in Haskell:
  //  dupli [1, 2, 3]
  //  [1,1,2,2,3,3]

  def dupli[T](l: List[T]): List[T] = l flatMap { x => List(x, x) }

  println(dupli(List(1, 2, 3)))

}
