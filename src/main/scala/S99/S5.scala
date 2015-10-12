package S99

/**
 * Created by kasonchan on 10/12/15.
 */
object S5 {

  //  5 Problem 5
  //  (*) Reverse a list.
  //  Example in Haskell:
  //  Prelude> myReverse "A man, a plan, a canal, panama!"
  //  "!amanap ,lanac a ,nalp a ,nam A"
  //  Prelude> myReverse [1,2,3,4]
  //  [4,3,2,1]

  def main(args: Array[String]) {
    val l1 = "A man, a plan, a canal, panama!"
    val l2 = List(1, 2, 3, 4)

    println(myReverse(l1))
    println(myReverse(l2))
    println(myReverse2(l1))
    println(myReverse2(l2))
  }

  def myReverse[T](l: Seq[T]): Seq[T] = l.reverse

  def myReverse2[T](l: Seq[T]): Seq[T] = l.foldLeft(List[T]()) { (h, r) => r :: h }
  
}
