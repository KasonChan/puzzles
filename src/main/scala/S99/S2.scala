package S99

/**
 * Created by kasonchan on 7/29/15.
 */
object S2 extends App {

  //  2 Problem 2
  //  (*) Find the last but one element of a list.
  //  (Note that the Lisp transcription of this problem is incorrect.)
  //  Example in Haskell:
  //  Prelude> myButLast [1,2,3,4]
  //  3
  //  Prelude> myButLast ['a'..'z']
  //  'y'

  val list1 = List(1, 2, 3, 4)
  val list2 = List('a', 'b', 'x', 'y', 'z')

  println(myButLast1(list1))
  println(myButLast1(list2))

  println(myButLast2(list1))
  println(myButLast2(list2))

  def myButLast1[T](list: List[T]): T = {
    list.init.last
  }

  def myButLast2[T](list: List[T]): T = {
    list match {
      case h :: _ :: Nil => h
      case _ :: tail => myButLast1(tail)
      case _ => throw new NoSuchElementException
    }
  }

}
