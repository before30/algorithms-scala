package algorithms.array

import algorithms.UnitSpec


class ThreeSumTest extends UnitSpec {

  "ThreeSum" when {

    "input list's size is larger or equal to 3" should {
      "success" in {
        assert(ThreeSum(List(-1, 0, 1, 2, -1, -4)) == Set(List(-1, -1, 2), List(-1, 0, 1)))
      }
    }

    "input list's size is less than 3" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          ThreeSum(List())
          ThreeSum(List(1))
          ThreeSum(List(1, 2))
        }
      }
    }

  }

}
