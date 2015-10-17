package S99

/**
 * Created by ka-son on 10/17/15.
 */
object S80 extends App {


  //  (***) Conversions
  //  Write predicates to convert between the different graph representations.
  //  With these predicates, all representations are equivalent;
  //  i.e. for the following problems you can always pick freely the most
  //  convenient form. The reason this problem is rated (***) is not because
  //  it"s particularly difficult, but because it"s a lot of work to deal with
  //  all the special cases.
  //  Example:
  //  <example in lisp>
  //  Example in Haskell:
  //  graphToAdj Graph ["b","c","d","f","g","h","k"] [("b","c"),("b","f"),("c","f"),("f","k"),("g","h")]
  //  Adj [("b", "cf"), ("c", "bf"), ("d", "), ("f", "bck"), ("g", "h"), ("h", "g"), ("k", "f")]

  type e = (String, String)

  case class Graph(nodes: List[String], edges: List[e])

  type n = (String, List[String])

  case class Adj(edges: List[n])

  def graphToAdj(graph: Graph): Adj = {
    val adjInt = for {
      node <- graph.nodes
      edges = graph.edges.filter(x => node == x._1 || node == x._2)
    } yield (node, edges)

    val adj = adjInt.map { ai =>
      (ai._1, ai._2.map {
        ai2 =>
          if (ai2._1 != ai._1) ai2._1
          else ai2._2
      })
    }

    Adj(adj)
  }

  val g = Graph(List("b", "c", "d", "f", "g", "h", "k"),
    List(("b", "c"), ("b", "f"), ("c", "f"), ("f", "k"), ("g", "h")))

  println(graphToAdj(g))

}
