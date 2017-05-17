package algorithms.string

/**
  * User: before30 
  * Date: 2017. 5. 17.
  * Time: PM 1:02
  */
/**
  * https://leetcode.com/problems/roman-to-integer/#/description
  *
  * Given a roman numeral, convert it to an integer.
  * Input is guaranteed to be within the range from 1 to 3999
  *
  * Example
  * MMMMCCCXII -> 4312
  * DXXI -> 521
  * XLIX -> 49
  *
  * I	1
  * IV	4
  * V	5
  * IX	9
  * X	10
  * XL	40
  * L	50
  * XC	90
  * C	100
  * CD	400
  * D	500
  * CM	900
  * M	1000
  */
object RomanToInteger {
  def romanToInteger(roman: String, acc: Int): Int = {
    roman match {
      case "" => acc
      case str if str.startsWith("IV") => romanToInteger(str.substring(2), acc + 4)
      case str if str.startsWith("IX") => romanToInteger(str.substring(2), acc + 9)
      case str if str.startsWith("XL") => romanToInteger(str.substring(2), acc + 40)
      case str if str.startsWith("XC") => romanToInteger(str.substring(2), acc + 90)
      case str if str.startsWith("CD") => romanToInteger(str.substring(2), acc + 400)
      case str if str.startsWith("CM") => romanToInteger(str.substring(2), acc + 900)
      case str if str.startsWith("I") => romanToInteger(str.substring(1), acc + 1)
      case str if str.startsWith("V") => romanToInteger(str.substring(1), acc + 5)
      case str if str.startsWith("X") => romanToInteger(str.substring(1), acc + 10)
      case str if str.startsWith("L") => romanToInteger(str.substring(1), acc + 50)
      case str if str.startsWith("C") => romanToInteger(str.substring(1), acc + 100)
      case str if str.startsWith("D") => romanToInteger(str.substring(1), acc + 500)
      case str if str.startsWith("M") => romanToInteger(str.substring(1), acc + 1000)
    }
  }

  def apply(roman: String): Int = {
    romanToInteger(roman, 0)
  }
}
