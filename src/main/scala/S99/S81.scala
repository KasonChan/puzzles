package S99

/**
 * Created by ka-son on 10/18/15.
 */
object S81 extends App {

  //  3 Problem 81
  //  (**) Path from one node to another one
  //  Write a function that, given two nodes a and b in a graph, returns all the acyclic paths from a to b.
  //  Example:
  //  <example in lisp>
  //  Example in Haskell:
  //  paths 1 4 [(1,2),(2,3),(1,3),(3,4),(4,2),(5,6)]
  //  [[1,2,3,4],[1,3,4]]
  //  paths 2 6 [(1,2),(2,3),(1,3),(3,4),(4,2),(5,6)]
  //  []

  type A = (Int, Int)

  type Arcs = List[A]

  val arcs: Arcs = List((1, 2), (2, 3), (1, 3), (3, 4), (4, 2), (5, 6))

  def paths(s: Int, d: Int, arcs: Arcs) = {

    def pathsHelper(c: A, d: Int, arcs: Arcs): Arcs = {
      val ss = arcs.filter(x => x._1 == c._2)

      ss match {
        case List() => List()
        case x: List[A] => x flatMap {
          case a: A => a match {
            case (c._2, `d`) => List(a)
            case (_, _) => List(a) ++ pathsHelper(a, d, arcs)
          }
        }
      }
    }

    val ss = arcs.filter(x => s == x._1)

    val r = ss match {
      case List() => List(List())
      case x: List[A] => x map {
        case a: A => a match {
          case (`s`, `d`) => List(a)
          case (_, _) => List(a) ++ pathsHelper(a, d, arcs)
        }
      }
    }

    r map { rr =>
      val ri = rr flatMap {
        a: A => List(a._1, a._2)
      }
      ri.distinct
    }

  }

  println(paths(1, 4, arcs))

}
