package S99

/**
 * Created by kasonchan on 10/21/15.
 */
object S16 extends App {

  //  6 Problem 16
  //  (**) Drop every N'th element from a list.
  //  Example
  //  (drop '(a b c d e f g h i k) 3)
  //  (A B D E G H K)
  //  Example in Haskell:
  //  dropEvery "abcdefghik" 3
  //  "abdeghk"

  def drop[T](l: List[T], n: Int): List[T] = {
    l.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
  }

  println(drop(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3))

}
