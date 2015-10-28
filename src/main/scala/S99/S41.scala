package S99

import S99.S40.goldbach

/**
 * Created by kasonchan on 10/28/15.
 */
object S41 extends App {

  //  12 Problem 41
  //  (**) Given a range of integers by its lower and upper limit, print a list
  //  of all even numbers and their Goldbach composition.
  //  In most cases, if an even number is written as the sum of two prime
  //  numbers, one of them is very small. Very rarely, the primes are both
  //  bigger than say 50. Try to find out how many such cases there are in the
  //  range 2..3000.
  //  Example:
  //  (goldbach-list 9 20)
  //  10 = 3 + 7
  //  12 = 5 + 7
  //  14 = 3 + 11
  //  16 = 3 + 13
  //  18 = 5 + 13
  //  20 = 3 + 17
  //  (goldbach-list 1 2000 50)
  //  992 = 73 + 919
  //  1382 = 61 + 1321
  //  1856 = 67 + 1789
  //  1928 = 61 + 1867
  //  Example in Haskell:
  //  goldbachList 9 20
  //  [(3,7),(5,7),(3,11),(3,13),(5,13),(3,17)]
  //  goldbachList' 4 2000 50
  //  [(73,919),(61,1321),(67,1789),(61,1867)]

  def goldbachList(s: Int, e: Int, l: Int = 0): Seq[(Int, (Int, Int))] = {
    (s to e).filter(n => n > 2 && n % 2 == 0)
      .map(n => (n, goldbach(n)))
      .filter(_._2._1 >= l)
  }

  def printList(seq: Seq[(Int, (Int, Int))]): Unit = {
    seq.foreach { case (s, (a, b)) => println(s + " = " + a + " + " + b) }
  }

  printList(goldbachList(9, 20))
  printList(goldbachList(4, 2000, 50))

}
