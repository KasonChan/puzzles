package S99

/**
 * Created by kasonchan on 10/16/15.
 */
object S46 extends App {

  //  2 Problem 46
  //  (**) Define predicates and/2, or/2, nand/2, nor/2, xor/2, impl/2 and equ/2
  //  (for logical equivalence) which succeed or fail according to the result of
  //  their respective operations; e.g. and(A,B) will succeed, if and only if both A and B succeed.
  //  A logical expression in two variables can then be written as in the
  //  following example: and(or(A,B),nand(A,B)).
  //  Now, write a predicate table/3 which prints the truth table of a given logical expression in two variables.
  //  Example:
  //  (table A B (and A (or A B)))
  //  true true true
  //  true fail true
  //  fail true fail
  //  fail fail fail
  //  Example in Haskell:
  //  table (\a b -> (and' a (or' a b)))
  //  True True True
  //  True False True
  //  False True False
  //  False False False

  def and(x: Boolean, y: Boolean): Boolean = (x, y) match {
    case (true, true) => true
    case (_, _) => false
  }

  def or(x: Boolean, y: Boolean): Boolean = (x, y) match {
    case (false, false) => false
    case (_, _) => true
  }

  def not(x: Boolean): Boolean = x match {
    case true => false
    case false => true
  }

  def nand(x: Boolean, y: Boolean): Boolean = not(and(x, y))

  def nor(a: Boolean, b: Boolean): Boolean = not(or(a, b))

  def equ(a: Boolean, b: Boolean): Boolean = or(and(a, b), and(not(a), not(b)))

  def xor(a: Boolean, b: Boolean): Boolean = not(equ(a, b))

  def impl(a: Boolean, b: Boolean): Boolean = or(not(a), b)

  def table(f: (Boolean, Boolean) => Boolean) {
    printf("%-10s %-10s %-10s\n", "A", "B", "Result")
    for {
      a <- List(true, false)
      b <- List(true, false)
    } {
      printf("%-10s %-10s %-10s\n", a, b, f(a, b))
    }
  }

  table((a: Boolean, b: Boolean) => and(a, or(a, b)))

}
