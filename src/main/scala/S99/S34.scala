package S99

import S99.S33.coprime

/**
 * Created by kasonchan on 10/15/15.
 */
object S34 extends App {

  //  5 Problem 34
  //  (**) Calculate Euler's totient function phi(m).
  //  Euler's so-called totient function phi(m) is defined as the number of
  //  positive integers r (1 <= r < m) that are coprime to m.
  //  Example: m = 10: r = 1,3,7,9; thus phi(m) = 4.
  //  Note the special case: phi(1) = 1.
  //  Example:
  //  (totient-phi 10)
  //  4
  //  Example in Haskell:
  //  totient 10
  //  4

  def totient(m: Int): Int = (1 to m).count(coprime(m, _))

  println(totient(10))

}
