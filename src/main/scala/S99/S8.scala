package S99

/**
 * Created by kasonchan on 10/13/15.
 */
object S8 extends App {

  //  8 Problem 8
  //  (**) Eliminate consecutive duplicates of list elements.
  //  If a list contains repeated elements they should be replaced with a single
  //  copy of the element. The order of the elements should not be changed.
  //  Example:
  //  (compress '(a a a a b c c a a d e e e e))
  //  (A B C A D E)
  //  Example in Haskell:
  //  compress "aaaabccaadeeee"
  //  "abcade"

  def compress[T](s: Seq[T]): Seq[T] = s.foldRight(List[T]()) { (h, t) =>
    if (t.isEmpty || t.head != h) h :: t
    else t
  }

  println(compress("aaaabccaadeeee"))

}
