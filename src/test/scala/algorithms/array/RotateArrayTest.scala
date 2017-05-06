package algorithms.array

import algorithms.UnitSpec


class RotateArrayTest extends UnitSpec {

  val inputList = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  val k = 7
  val expectedOutput = List(3, 4, 5, 6, 7, 8, 9, 0, 1, 2)

  "RotateArray.dropAndTake" when {

    "k is larger or equal to 0" should {
      "success" in {
        assert(RotateArray.dropAndTake(inputList, k) == expectedOutput)
      }
    }

    "k is less than 0" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          RotateArray.dropAndTake(List(), -1)
        }
      }
    }
  }

  "RotateArray.updated" when {

    "k is larger or equal to 0" should {
      "success" in {
        assert(RotateArray.updated(inputList, k) == expectedOutput)
      }
    }

    "k is less than 0" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          RotateArray.updated(List(), -1)
        }
      }
    }
  }

}
