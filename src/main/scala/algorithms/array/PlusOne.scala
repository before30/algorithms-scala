package algorithms.array

import scala.collection.immutable.Stream.Empty

/**
  * User: before30 
  * Date: 2017. 5. 8.
  * Time: AM 8:59
  *
  * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
  * You may assume the integer do not contain any leading zero, except the number 0 itself.
  * The digits are stored such that the most significant digit is at the head of the list.
  *
  * Example
  *   f([1, 2, 3] : 123) = [1, 2, 4]: 124
  *   f([9, 9, 9] : 999) = [1, 0, 0, 0]: 1000
  */
object PlusOne {

  def apply(digits: List[Int], digit: Int): List[Int] = {
    plusDigit(digits, digit)
  }

  def apply(digits: List[Int]): List[Int] = {
    plusOne(digits)
  }

  def  plusOne(digits: List[Int]): List[Int] = {
    plusDigit(digits, 1)
  }

  def plusDigit(digits: List[Int], digit: Int): List[Int] = {
    val test = calc(digits.reverse, digit, Nil)
    println(test)
    test
  }

  def calc(digits: List[Int], carry: Int, acc: List[Int]): List[Int] = {
    digits match {
      case Nil if carry == 0 => acc
      case Nil if carry > 0 => carry::acc
      case _ => {
        val temp = digits.head + carry
        calc(digits.tail, temp/10, temp%10::acc)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    plusOne(List(1,2,3))
  }
}
