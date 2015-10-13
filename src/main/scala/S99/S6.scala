package S99

/**
 * Created by kasonchan on 10/13/15.
 */
object S6 extends App {

  //  6 Problem 6
  //  (*) Find out whether a list is a palindrome. A palindrome can be read forward or backward; e.g. (x a m a x).
  //  Example in Haskell:
  //  Main> isPalindrome [1,2,3]
  //  False
  //  Main> isPalindrome "madamimadam"
  //  True
  //  Main> isPalindrome [1,2,4,8,16,8,4,2,1]
  //  True

  def isPalindrome[T]: Seq[T] => Boolean = (s: Seq[T]) => s == s.reverse

  println(isPalindrome(List(1,2,3)))
  println(isPalindrome("madamimadam"))
  println(isPalindrome(List(1,2,4,8,16,8,4,2,1)))

}
