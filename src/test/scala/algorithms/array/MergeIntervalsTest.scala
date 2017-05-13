package algorithms.array

import algorithms.UnitSpec


class MergeIntervalsTest extends UnitSpec {

  "MergedIntervals" should {

    val expectedResult = List(Interval(1, 6), Interval(8, 10), Interval(15, 18))

    "success" in {

      implicit def listToInterval(list: List[Int]): Interval = MergeIntervals.listToInterval(list)

      assert(MergeIntervals(List(List(1, 3), List(2, 6), List(8, 10), List(15, 18))) == expectedResult)

      implicit def tupleToInterval(tuple: (Int, Int)): Interval = MergeIntervals.tupleToInterval(tuple)

      assert(MergeIntervals(List((1, 3), (2, 6), (8, 10), (15, 18))) == expectedResult)

      assert(MergeIntervals(List(Interval(1, 3), Interval(2, 6), Interval(8, 10), Interval(15, 18))) == expectedResult)
    }
  }
}
