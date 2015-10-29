package S99

import helpers.{End, Node, Tree}

/**
 * Created by kasonchan on 10/29/15.
 */
object S55 extends App {

  //  3 Problem 55
  //  (**) Construct completely balanced binary trees
  //  In a completely balanced binary tree, the following property holds for every
  //  node: The number of nodes in its left subtree and the number of nodes in
  //  its right subtree are almost equal, which means their difference is not
  //  greater than one.
  //  Write a function cbal-tree to construct completely balanced binary trees
  //  for a given number of nodes. The predicate should generate all solutions
  //  via backtracking. Put the letter 'x' as information into all nodes of the tree.
  //  Example:
  //  cbal-tree(4,T).
  //  T = t(x, t(x, nil, nil), t(x, nil, t(x, nil, nil))) ;
  //  T = t(x, t(x, nil, nil), t(x, t(x, nil, nil), nil)) ;
  //  etc......No
  //  Example in Haskell, whitespace and "comment diagrams" added for clarity and exposition:
  //  cbalTree 4
  //  [
  //  -- permutation 1
  //  --     x
  //  --    / \
  //  --   x   x
  //  --        \
  //  --         x
  //    Branch 'x' (Branch 'x' Empty Empty)
  //  (Branch 'x' Empty
  //  (Branch 'x' Empty Empty)),
  //
  //  -- permutation 2
  //  --     x
  //  --    / \
  //  --   x   x
  //  --      /
  //  --     x
  //    Branch 'x' (Branch 'x' Empty Empty)
  //  (Branch 'x' (Branch 'x' Empty Empty)
  //  Empty),
  //
  //  -- permutation 3
  //  --     x
  //  --    / \
  //  --   x   x
  //  --    \
  //  --     x
  //    Branch 'x' (Branch 'x' Empty
  //  (Branch 'x' Empty Empty))
  //  (Branch 'x' Empty Empty),
  //
  //  -- permutation 4
  //  --     x
  //  --    / \
  //  --   x   x
  //  --  /
  //    -- x
  //    Branch 'x' (Branch 'x' (Branch 'x' Empty Empty)
  //  Empty)
  //  (Branch 'x' Empty Empty)
  //  ]

  def cbalTree[T](nodes: Int, value: T): List[Tree[T]] = nodes match {
    case n if n < 1 => List(End)
    case n if n % 2 == 1 => {
      val subtrees = cbalTree(n / 2, value)
      subtrees.flatMap(l => subtrees.map(r => Node(value, l, r)))
    }
    case n if n % 2 == 0 => {
      val lesserSubtrees = cbalTree((n - 1) / 2, value)
      val greaterSubtrees = cbalTree((n - 1) / 2 + 1, value)
      lesserSubtrees.flatMap(l => greaterSubtrees
        .flatMap(g => List(Node(value, l, g), Node(value, g, l))))
    }
  }

  println(cbalTree(4, "x"))

}
