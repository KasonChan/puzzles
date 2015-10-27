package S99

/**
 * Created by kasonchan on 10/27/15.
 */

import S99.S36.prime_factors_mult

object S37 extends App {

  //  8 Problem 37
  //  (**) Calculate Euler's totient function phi(m) (improved).
  //  See problem 34 for the definition of Euler's totient function.
  //  If the list of the prime factors of a number m is known in the form of
  //  problem 36 then the function phi(m) can be efficiently calculated as
  //  follows: Let ((p1 m1) (p2 m2) (p3 m3) ...) be the list of prime factors
  //  (and their multiplicities) of a given number m. Then phi(m) can be
  //  calculated with the following formula:
  //  phi(m) = (p1 - 1) * p1 ** (m1 - 1) *
  //  (p2 - 1) * p2 ** (m2 - 1) *
  //  (p3 - 1) * p3 ** (m3 - 1) * ...
  //  Note that a ** b stands for the b'th power of a.

  /**
   * totient
   * @param x The number of positive integers r (1 <= r < m) that are coprime to m
   * @return the Euler's totient function phi(m) result
   */
  def totient(x: Int): Int = prime_factors_mult(x).foldLeft(1) { (r, f) =>
    f match {
      case (p, m) => (r * (p - 1) * Math.pow(p, m - 1)).toInt
    }
  }

  println(totient(10))

}
