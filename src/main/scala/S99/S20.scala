package S99

import scala.language.postfixOps

/**
 * Created by kasonchan on 10/23/15.
 */
object S20 extends App {

  //  10 Problem 20
  //  (*) Remove the K'th element from a list.
  //  Example in Prolog:
  //  remove_at(X,[a,b,c,d],2,R).
  //  X = b
  //  R = [a,c,d]
  //  Example in Lisp:
  //  (remove-at '(a b c d) 2)
  //  (A C D)
  //  (Note that this only returns the residue list, while the Prolog version
  //  also returns the deleted element.)
  //  Example in Haskell:
  //  removeAt 2 "abcd"
  //  ('b',"acd")

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def removeAt[T](l: List[T], i: Int): (List[T], List[T]) = {
    val ri = l.zipWithIndex.partition(x => x._2 == i)
    (ri._1.map(x => x._1), ri._2.map(x => x._1))
  }

  println(removeAt(l1, 2))
  println(removeAt(l2, 2))

}
