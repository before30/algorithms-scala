package algorithms.array

import scala.collection.mutable.ListBuffer


/**
  * find missing ranges between low and high in the given array.
  * ex) [3, 5] lo=1 hi=10 => answer: [1->2, 4, 6->10]
  */
object MissingRanges {

  def apply(list: List[Int], lo: Int, hi: Int): List[String] = {
    if (lo >= hi) throw new IllegalArgumentException(s"Invalid range [$lo, $hi]")

    val source = list.sorted
    var missingRanges = ListBuffer[String]()

    var start = lo

    for (v <- source) {
      if (v <= start) {
        start = v + 1
      }
      else {
        missingRanges += getRange(start, v - 1)
        start = v + 1
      }
    }

    if (start <= hi) {
      missingRanges += getRange(start, hi - 1)
    }

    missingRanges.toList
  }

  private[this] def getRange(start: Int, end: Int): String = {
    if (start == end) {
      start.toString
    } else {
      start.toString + "->" + end.toString
    }
  }

}
