package S99

import helpers.Helpers.primes

/**
 * Created by kasonchan on 10/27/15.
 */
object S39 extends App {

  //  10 Problem 39
  //  (*) A list of prime numbers.
  //  Given a range of integers by its lower and upper limit, construct a list
  //  of all prime numbers in that range.
  //  Example in Haskell:
  //  primesR 10 20
  //  [11,13,17,19]

  def primesR(s: Int, e: Int): List[Int] = {
    val r: Range = s to e
    primes dropWhile (_ < r.head) takeWhile (_ <= r.last) toList
  }

  println(primesR(10, 20))

}
