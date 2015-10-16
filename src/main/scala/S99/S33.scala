package S99

import S99.S32.gcd

/**
 * Created by kasonchan on 10/15/15.
 */
object S33 extends App {

  //  4 Problem 33
  //  (*) Determine whether two positive integer numbers are coprime. Two
  //  numbers are coprime if their greatest common divisor equals 1.
  //  Example:
  //  (coprime 35 64)
  //  T
  //  Example in Haskell:
  //  coprime 35 64
  //  True

  def coprime(x: Int, y: Int): Boolean = gcd(x, y) == 1

  println(coprime(35, 64))

}
