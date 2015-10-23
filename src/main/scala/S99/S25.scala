package S99

/**
 * Created by kasonchan on 10/23/15.
 */
object S25 extends App {

  //  5 Problem 25
  //  Generate a random permutation of the elements of a list.
  //  Example:
  //  (rnd-permu '(a b c d e f))
  //  (B A D C E F)
  //  Example in Haskell:
  //  rnd_permu "abcdef"
  //  "badcef"

  val l1 = List()
  val l2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')

  def rndPermu[T](l: List[T]) = {
    val rand = new util.Random
    val a = l.toParArray
    for (i <- a.length - 1 to 1 by -1) {
      val i1 = rand.nextInt(i + 1)
      val t = a(i)
      a.update(i, a(i1))
      a.update(i1, t)
    }
    a.toList
  }

  println(rndPermu(l1))
  println(rndPermu(l2))

}
