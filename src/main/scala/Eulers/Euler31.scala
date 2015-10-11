package Eulers

/**
 * Created by ka-son on 10/11/15.
 */
object Euler31 {

  // In England the currency is made up of pound, £, and pence, p, and there are
  // eight coins in general circulation:
  // 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
  // It is possible to make £2 in the following way:
  // 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
  // How many different ways can £2 be made using any number of coins?

  def main(args: Array[String]) {

    val solution = for {
      onePennyNum <- 0 to 200
      twoPennyNum <- 0 to 100
      fivePennyNum <- 0 to 40
      tenPennyNum <- 0 to 20
      twentyPennyNum <- 0 to 10
      fiftyPennyNum <- 0 to 4
      onePoundNum <- 0 to 2
      twoPoundNum <- 0 to 1
      if ((1 * onePennyNum) + (2 * twoPennyNum) + (5 * fivePennyNum) +
        (10 * tenPennyNum) + (20 * twentyPennyNum) + (50 * fiftyPennyNum)
        + (100 * onePoundNum) + (200 * twoPoundNum)) == 200
    } yield (onePennyNum, twoPennyNum, fivePennyNum, tenPennyNum,
        twentyPennyNum, fiftyPennyNum, onePoundNum, twoPoundNum)

    println(solution)

  }

}
