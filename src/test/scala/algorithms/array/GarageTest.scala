package algorithms.array

import algorithms.UnitSpec


class GarageTest extends UnitSpec {

  "Garage" when {

    "size of initial and final state is equal" should {
      "success" in {
        assert(Garage(List(1, 2, 3, 0, 4), List(0, 3, 2, 1, 4)) == 4)
      }
    }

    "size of initial and final state is not equal" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          Garage(List(1, 2, 3, 0, 4), List(0, 3, 2, 1))
        }
      }
    }

  }

}
