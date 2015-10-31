package helpers

/**
 * Created by kasonchan on 10/29/15.
 */
sealed abstract class Tree[+T] {
  def isMirrorOf[V](tree: Tree[V]): Boolean

  def isSymmetric: Boolean
}

case class Branch[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"

  def isMirrorOf[U](tree: Tree[U]): Boolean = tree match {
    case t: Branch[U] => left.isMirrorOf(t.right) && right.isMirrorOf(t.left)
    case _ => false
  }

  def isSymmetric: Boolean = left.isMirrorOf(right)
}

case object Empty extends Tree[Nothing] {
  override def toString = "."

  def isMirrorOf[V](tree: Tree[V]): Boolean = tree == Empty

  def isSymmetric: Boolean = true
}

object Branch {
  def apply[T](value: T): Branch[T] = Branch(value, Empty, Empty)

  def isMirrorOf[U](tree: Tree[U]): Boolean = tree == Empty

  def isSymmetric: Boolean = true
}
