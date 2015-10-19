package S99

import S99.S47.S47

/**
 * Created by kasonchan on 10/19/15.
 */
object S48 extends App {

  //  4 Problem 48
  //  (**) Truth tables for logical expressions (3).
  //  Generalize problem P47 in such a way that the logical expression may
  //  contain any number of logical variables. Define table/2 in a way that
  //  table(List,Expr) prints the truth table for the expression Expr, which
  //  contains the logical variables enumerated in List.
  //  Example:
  //  (table (A,B,C) (A and (B or C) equ A and B or A and C))
  //  true true true true
  //  true true fail true
  //  true fail true true
  //  true fail fail true
  //  fail true true true
  //  fail true fail true
  //  fail fail true true
  //  fail fail fail true
  //  Example in Haskell:
  //  tablen 3 (\[a,b,c] -> a `and'` (b `or'` c) `equ'` a `and'` b `or'` a `and'` c)
  //  -- infixl 3 `equ'`
  //    True  True  True  True
  //    True  True  False True
  //    True  False True  True
  //    True  False False True
  //    False True  True  True
  //    False True  False True
  //    False False True  True
  //    False False False True
  //  -- infixl 7 `equ'`
  //    True  True  True  True
  //    True  True  False True
  //    True  False True  True
  //    True  False False False
  //    False True  True  False
  //    False True  False False
  //    False False True  False
  //    False False False False

  implicit def logic(a: Boolean): S47 = new S47(a)

  def table(f: (Boolean, Boolean, Boolean) => Boolean) {
    printf("%-10s %-10s %-10s %-10s\n", "A", "B", "C", "Result")
    for {
      a <- List(true, false)
      b <- List(true, false)
      c <- List(true, false)
    } {
      printf("%-10s %-10s %-10s %-10s\n", a, b, c, f(a, b, c))
    }
  }

  table((a: Boolean, b: Boolean, c: Boolean) => a and (b or c) equ a and b or a and c)

}
