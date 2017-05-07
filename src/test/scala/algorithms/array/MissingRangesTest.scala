package algorithms.array

import algorithms.UnitSpec


class MissingRangesTest extends UnitSpec {

  "MissingRangesTest" when {

    "lower bound is less than higher bound" should {
      "success" in {
        assert(MissingRanges(List(1, 3, 5), 0, 10) == List("0", "2", "4", "6->9"))
      }
    }

    "lower bound is larger or equal to higher bound" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          MissingRanges(List(1, 3, 5), 10, 0)
        }
      }
    }
  }

}
