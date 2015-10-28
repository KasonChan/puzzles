package S99

import helpers.Helpers.{isPrime, primes}

/**
 * Created by kasonchan on 10/28/15.
 */
object S40 extends App {

  //  11 Problem 40
  //  (**) Goldbach's conjecture.
  //  Goldbach's conjecture says that every positive even number greater than 2
  //  is the sum of two prime numbers. Example: 28 = 5 + 23. It is one of the
  //  most famous facts in number theory that has not been proved to be correct
  //  in the general case. It has been numerically confirmed up to very large
  //  numbers (much larger than we can go with our Prolog system). Write a
  //  predicate to find the two prime numbers that sum up to a given even integer.
  //  Example:
  //  (goldbach 28)
  //  (5 23)
  //  Example in Haskell:
  //  goldbach 28
  //  (5, 23)

  def goldbach(n: Int): (Int, Int) = {
    primes takeWhile (_ < n) find (p => isPrime((n - p))) match {
      case None => throw new IllegalArgumentException
      case Some(p1) => (p1, n - p1)
    }
  }

  println(goldbach(28))

}
