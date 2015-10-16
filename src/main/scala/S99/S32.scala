package S99

/**
 * Created by kasonchan on 10/15/15.
 */
object S32 extends App {

  //  3 Problem 32
  //  (**) Determine the greatest common divisor of two positive integer
  //  numbers. Use Euclid's algorithm.
  //  Example:
  //  (gcd 36 63)
  //  9
  //  Example in Haskell:
  //  [myGCD 36 63, myGCD (-3) (-6), myGCD (-3) 6]
  //  [9,3,3]

  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

  println(gcd(36, 63))

}
