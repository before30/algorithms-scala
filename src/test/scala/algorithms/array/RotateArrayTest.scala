package algorithms.array

import algorithms.UnitSpec


class RotateArrayTest extends UnitSpec {

  "RotateArray" when {

    "k is larger or equal to 0" should {
      "success" in {
        assert(RotateArray(List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), 7) == List(7, 8, 9, 0, 1, 2, 3, 4, 5, 6))
      }
    }

    "k is less than 0" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          RotateArray(List(), -1)
        }
      }
    }

  }

}
