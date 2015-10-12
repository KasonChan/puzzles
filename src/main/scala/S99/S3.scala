package S99

/**
 * Created by kasonchan on 10/12/15.
 */
object S3 {

  //  3 Problem 3
  //  (*) Find the K'th element of a list. The first element in the list is number 1.
  //  Example:
  //  (element-at '(a b c d e) 3)
  //  c
  //  Example in Haskell:
  //  Prelude> elementAt [1,2,3] 2
  //  2
  //  Prelude> elementAt "haskell" 5
  //  'e'

  def main(args: Array[String]) {

    val l1 = List('a', 'b', 'c', 'd', 'e')
    val l2 = List(1, 2, 3)
    val l3 = "haskell"

    println(elementAt(l1, 3))
    println(elementAt(l2, 2))
    println(elementAt(l3, 5))
    println(elementAt(l3, 10))

  }

  def elementAt[T]: (Seq[T], Int) => Option[T] =
    (list, i) => try {
      Some(list(i))
    } catch {
      case e: Exception => None
    }

}
