package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S23 extends App {

  //  3 Problem 23
  //  Extract a given number of randomly selected elements from a list.
  //  Example:
  //  (rnd-select '(a b c d e f g h) 3)
  //  (E D A)
  //  Example in Haskell:
  //  rnd_select "abcdefgh" 3 >>= putStrLn
  //  eda

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def abs(i: Int): Int = i < 0 match {
    case true => -i
    case false => i
  }

  def rndSelect[T](l: List[T], i: Int) = {
    val r = scala.util.Random

    l.isEmpty match {
      case true => List()
      case false =>
        for {
          x <- 0 until i
          n = r.nextInt(l.length)
        } yield l(abs(n))
    }
  }

  println(rndSelect(l1, 3))
  println(rndSelect(l2, 3))

}
