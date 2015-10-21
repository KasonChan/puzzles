package S99

/**
 * Created by kasonchan on 10/21/15.
 */
object S12 extends App {

  //  2 Problem 12
  //  (**) Decode a run-length encoded list.
  //  Given a run-length code list generated as specified in problem 11. Construct its uncompressed version.
  //  Example in Haskell:
  //  P12> decodeModified
  //  [Multiple 4 'a',Single 'b',Multiple 2 'c',
  //  Multiple 2 'a',Single 'd',Multiple 4 'e']
  //  "aaaabccaadeeee"

  val l1 = List()
  val l2 = List(Right((4, 'a')), Left('b'), Right((2, 'c')), Right((2, 'a')), Left('d'), Right((4, 'e')))

  def decodedModified[T](l: List[T]): String = {
    val r = l.isEmpty match {
      case true => List("")
      case false => l flatMap {
        case Left(x) =>
          x match {
            case c: Char => c.toString
            case _ => ""
          }
        case Right(y) => y match {
          case (i: Int, c: Char) => c.toString * i
          case _ => ""
        }
      }
    }

    r.mkString
  }

  println(decodedModified(l1))
  println(decodedModified(l2))

}
