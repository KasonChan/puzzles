package S99

import helpers.Tree

/**
 * Created by ka-son on 10/31/15.
 */
object S56 {

  //  4 Problem 56
  //  (**) Symmetric binary trees
  //  Let us call a binary tree symmetric if you can draw a vertical line
  //  through the root node and then the right subtree is the mirror image of
  //  the left subtree. Write a predicate symmetric/1 to check whether a given
  //  binary tree is symmetric. Hint: Write a predicate mirror/2 first to check
  //  whether one tree is the mirror image of another. We are only interested
  //  in the structure, not in the contents of the nodes.
  //  Example in Haskell:
  //  symmetric (Branch 'x' (Branch 'x' Empty Empty) Empty)
  //  False
  //  symmetric (Branch 'x' (Branch 'x' Empty Empty) (Branch 'x' Empty Empty))
  //  True

  def symmetric[T](t: Tree[T]): Boolean = {
    t.isSymmetric
  }

}
