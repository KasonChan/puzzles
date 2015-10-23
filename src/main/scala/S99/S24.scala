package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S24 extends App {

  //  4 Problem 24
  //  Lotto: Draw N different random numbers from the set 1..M.
  //  Example:
  //  (rnd-select 6 49)
  //  (23 1 17 33 21 37)
  //  Example in Haskell:
  //  diff_select 6 49
  //  Prelude System.Random>[23,1,17,33,21,37]

  def diffSelect(n: Int, m: Int): Seq[Int] = {
    val r = scala.util.Random

    for {
      x <- 0 until n
      n = r.nextInt(m)
    } yield n
  }

  println(diffSelect(6, 49))

}
