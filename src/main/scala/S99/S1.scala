package S99

/**
 * Created by kasonchan on 7/28/15.
 */
object S1 {

  // 1 Problem 1
  // (*) Find the last element of a list.
  // Example in Haskell:
  // Prelude> myLast [1,2,3,4]
  // 4
  // Prelude> myLast ['x','y','z']
  // 'z'

  def main(args: Array[String]) {
    val list1 = (1 to 4).toList
    val list2 = List('x', 'y', 'z')

    println(myLast1(list1))
    println(myLast1(list2))

    println(myLast2(list1))
    println(myLast2(list2))
  }

  def myLast1[T](list: Seq[T]): T = {
    list.last
  }

  def myLast2[T](list: Seq[T]): T = {
    list.reverse.head
  }

}
