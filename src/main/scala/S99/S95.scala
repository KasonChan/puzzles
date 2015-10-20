package S99

/**
 * Created by kasonchan on 10/20/15.
 */
object S95 extends App {

  //  2 Problem 95
  //  (**) English number words
  //  On financial documents, like cheques, numbers must sometimes be written in
  //  full words. Example: 175 must be written as one-seven-five. Write a
  //  predicate full-words/1 to print (non-negative) integer numbers in full words.
  //  Example in Haskell:
  //  fullWords 175
  //  one-seven-five

  def fullWords(i: Int): String = {
    require(i > 0)

    val s = i.toString

    val r = for {
      i <- 0 to s.length - 1
    } yield word(s(i))

    r.mkString("", "-", "")
  }

  def word(s: Char): String = {
    s match {
      case '1' => "one"
      case '2' => "two"
      case '3' => "three"
      case '4' => "four"
      case '5' => "five"
      case '6' => "six"
      case '7' => "seven"
      case '8' => "eight"
      case '9' => "nine"
    }
  }

  println(fullWords(175))
  println(fullWords(-1))

}
