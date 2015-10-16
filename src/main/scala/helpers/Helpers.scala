package helpers

/**
 * Created by kasonchan on 10/12/15.
 */
object Helpers {

  def isPrime(i: Int): Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }

  def primeFactors(num: Long): List[Long] = {
    val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(d) => d :: primeFactors(num / d)
      case None => List(num)
    }
  }

  def primes = Stream.cons(2, Stream.from(3, 2) filter {
    isPrime(_)
  })

  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

  def coprime(x: Int, y: Int): Boolean = gcd(x, y) == 1

  def totient(m: Int): Int = (1 to m).count(coprime(m, _))

}
