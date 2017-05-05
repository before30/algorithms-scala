package algorithms.array

import algorithms.UnitSpec


class TwoSumTest extends UnitSpec {

  "TwoSumTest" when {

    "target is 5" should {

      val target = 5

      "success with List(1,2,3)" in {
        assert(TwoSum(List(1, 2, 3), target) == List(1, 2))
      }

      "fail with List(1,3,5)" in {
        assert(TwoSum(List(1, 3, 5), target) == List(-1, -1))
      }

    }

  }

}
