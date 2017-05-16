package algorithms.string

/**
  * Created by before30 on 16/05/2017.
  */

/*
Given two binary strings,
return their sum (also a binary string).

For example,
 a = "11"
 b = "1"
Return "100".
*/

object AddBinary {

  // "1111", "1" -> 10000

  def add(list1: List[Int], list2: List[Int], carry: Int, acc: List[Int]): List[Int] = {
    if (list1.isEmpty && list2.isEmpty && carry != 0) carry::acc
    else if(list1.isEmpty && list2.isEmpty && carry == 0) acc
    else {
      val (h1, t1) = if (!list1.isEmpty) (list1.head, list1.tail) else (0, Nil)
      val (h2, t2) = if (!list2.isEmpty) (list2.head, list2.tail) else (0, Nil)
      val c1 = (h1 + h2 + carry) / 2
      val v = (h1 + h2 + carry) % 2
      add(t1, t2, c1, v :: acc)
    }


  }
  def apply(a: String, b: String): String = {

    add(a.toList.map(x => x - '0').reverse, b.toList.map(x => x - '0').reverse, 0, Nil).mkString("")
  }

  def main(args: Array[String]): Unit = {
    println("10000 == " + AddBinary("1111", "1"))
    println("0 == " + AddBinary("0", "0"))
    println("10 == " + AddBinary("1", "1"))
    println("10000000001 == " + AddBinary("10000000000", "1"))
    println("10000 == " + AddBinary("1101", "11"))
    println("10000 ==" + AddBinary("1", "1111"))
    println("101 ==" + AddBinary("001", "100"))
  }
}
