package helpers

/**
 * Created by kasonchan on 10/12/15.
 */
object Helpers {

  def primeFactors(num: Long): List[Long] = {
    val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(d) => d :: primeFactors(num / d)
      case None => List(num)
    }
  }

}
