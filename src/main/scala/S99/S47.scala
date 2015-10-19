package S99

import S99.S46.table

/**
 * Created by kasonchan on 10/19/15.
 */
object S47 extends App {

  //  3 Problem 47
  //  (*) Truth tables for logical expressions (2).
  //  Continue problem P46 by defining and/2, or/2, etc as being operators. This
  //  allows to write the logical expression in the more natural way, as in the
  //  example: A and (A or not B). Define operator precedence as usual; i.e. as in Java.
  //  Example:
  //  (table A B (A and (A or not B)))
  //  true true true
  //  true fail true
  //  fail true fail
  //  fail fail fail
  //  Example in Haskell:
  //  table2 (\a b -> a `and'` (a `or'` not b))
  //  True True True
  //  True False True
  //  False True False
  //  False False False

  class S47(a: Boolean) {

    import S46._

    def and(b: Boolean): Boolean = (a, b) match {
      case (true, true) => true
      case _ => false
    }

    def or(b: Boolean): Boolean = (a, b) match {
      case (true, _) => true
      case (_, true) => true
      case _ => false
    }

    def equ(b: Boolean): Boolean = (a and b) or (not(a) and not(b))

    def xor(b: Boolean): Boolean = not(a equ b)

    def nor(b: Boolean): Boolean = not(a or b)

    def nand(b: Boolean): Boolean = not(a and b)

    def impl(b: Boolean): Boolean = not(a) or b

  }

  implicit def logic(a: Boolean): S47 = new S47(a)

  table((a: Boolean, b: Boolean) => a and (a or b))

}
