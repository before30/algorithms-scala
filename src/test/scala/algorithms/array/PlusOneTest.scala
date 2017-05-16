package algorithms.array

import algorithms.UnitSpec

/**
  * User: before30 
  * Date: 2017. 5. 8.
  * Time: AM 9:16
  */
class PlusOneTest extends UnitSpec {
  "PlusOne" should {

    "success1" in {
      assert(PlusOne(List(1, 2, 3)) == List(1, 2, 4))
    }

    "success2" in {
      assert(PlusOne(List(9, 9, 9)) == List(1, 0, 0, 0))
    }

  }

  "PlusDigit" should {

    "success1" in {
      assert(PlusOne(List(1, 2, 3), 2) == List(1, 2, 5))
    }

    "success2" in {
      assert(PlusOne(List(9, 9, 9), 2) == List(1, 0, 0, 1))
    }

  }

}
