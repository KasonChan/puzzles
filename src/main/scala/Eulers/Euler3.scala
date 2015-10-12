package Eulers

import helpers.Helpers.primeFactors

/**
 * Created by kasonchan on 10/12/15.
 */
object Euler3 {

  // The prime factors of 13195 are 5, 7, 13 and 29.
  // What is the largest prime factor of the number 600851475143 ?

  def main(args: Array[String]) {
    println(primeFactors(600851475143L).last)
  }

}
