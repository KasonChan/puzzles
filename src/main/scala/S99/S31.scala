package S99

/**
 * Created by kasonchan on 10/15/15.
 */
object S31 extends App {

  //  1 Arithmetic
  //  2 Problem 31
  //  (**) Determine whether a given integer number is prime.
  //  Example:
  //  * (is-prime 7)
  //  T
  //  Example in Haskell:
  //  P31> isPrime 7
  //  True

  def isPrime(i: Int): Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }

  println(isPrime(7))

}
