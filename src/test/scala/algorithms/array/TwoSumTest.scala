package algorithms.array

import algorithms.UnitSpec


class TwoSumTest extends UnitSpec {

  "TwoSum" when {

    "target is 5" should {

      val target = 5

      "success with List(1,2,3)" in {
        val input: List[Int] = List(1, 2, 3)
        val result: List[Int] = TwoSum(input, target)

        assert(result == List(1, 2))
        assert(input.apply(result.head) + input.apply(result.last) == target)
      }

      "fail with List(1,3,5)" in {
        assert(TwoSum(List(1, 3, 5), target) == List(-1, -1))
      }

    }

  }

}
