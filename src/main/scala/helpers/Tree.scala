package helpers

/**
 * Created by kasonchan on 10/29/15.
 */
sealed abstract class Tree[+T]

case class Branch[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}

case object Empty extends Tree[Nothing] {
  override def toString = "."
}

object Branch {
  def apply[T](value: T): Branch[T] = Branch(value, Empty, Empty)
}
