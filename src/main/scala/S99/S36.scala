package S99

import S99.S10.encode
import helpers.Helpers.primeFactors

/**
 * Created by kasonchan on 10/26/15.
 */
object S36 extends App {

  //  7 Problem 36
  //  (**) Determine the prime factors of a given positive integer.
  //  Construct a list containing the prime factors and their multiplicity.
  //  Example:
  //  (prime-factors-mult 315)
  //  ((3 2) (5 1) (7 1))
  //  Example in Haskell:
  //  prime_factors_mult 315
  //  [(3,2),(5,1),(7,1)]

  def prime_factors_mult(x: Int): List[(Long, Int)] = {
    encode(primeFactors(315)).getOrElse(List()).map(_.swap)
  }

  println(prime_factors_mult(315))

}
