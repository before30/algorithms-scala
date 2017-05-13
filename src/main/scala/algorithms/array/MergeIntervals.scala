package algorithms.array

import scala.collection.mutable.ListBuffer


case class Interval(start: Int, end: Int) extends Ordered[Interval] {

  override def compare(that: Interval): Int =
    if (this.start == that.start)
      this.end compare that.end
    else
      this.start compare that.start
}

object MergeIntervals {

  implicit def listToInterval(list: List[Int]): Interval = Interval(list.head, list.apply(1))

  implicit def tupleToInterval(tuple: (Int, Int)): Interval = Interval(tuple._1, tuple._2)

  def apply(intervals: List[Interval]): List[Interval] = {
    var merged = ListBuffer.empty[Interval]

    val sorted = intervals.sorted
    sorted.zipWithIndex.foreach(zipped => {
      val (interval, i) = zipped
      if(i > 0) {
        val prevInterval = sorted.apply(i - 1)

        if(prevInterval.end >= interval.start) {
          merged = merged.updated(i - 1, Interval(prevInterval.start, interval.end))
        } else {
          merged += interval
        }
      } else {
        merged += interval
      }
    })

    merged.toList
  }
}
