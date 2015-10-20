package S99

/**
 * Created by kasonchan on 10/20/15.
 */
object S96 extends App {

  //  3 Problem 96
  //  (**) Syntax checker
  //  In a certain programming language (Ada) identifiers are defined by the
  //  syntax diagram below.
  //  p96.gif
  //  Transform the syntax diagram into a system of syntax diagrams which do not
  //  contain loops; i.e. which are purely recursive. Using these modified
  //  diagrams, write a predicate identifier/1 that can check whether or not a
  //  given string is a legal identifier.
  //  Example in Prolog:
  //  identifier(Str) :- Str is a legal identifier
  //  Example in Haskell:
  //  identifier "this-is-a-long-identifier"
  //  True
  //  identifier "this-ends-in-"
  //  False
  //  identifier "two--hyphens"
  //  False

  def identifier(s: String): Boolean = {
    val pattern = "[a-zA-Z](-?[a-zA-Z0-9])*"

    s matches pattern
  }

  println(identifier("this-is-a-long-identifier"))
  println(identifier("this-ends-in-"))
  println(identifier("two--hyphens"))
  println(identifier("-"))
  println(identifier("0-test"))
  println(identifier("test"))

}
