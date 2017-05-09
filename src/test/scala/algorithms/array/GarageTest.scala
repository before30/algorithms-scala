package algorithms.array

import algorithms.UnitSpec

/**
  * User: before30 
  * Date: 2017. 5. 9.
  * Time: PM 11:19
  */
class GarageTest extends UnitSpec {

  "Method Test" should {
    "swap test" in {
      assert(Garage.swap(List(1,2,3,4,0), 4, 0) == List(0,2,3,4,1))
    }

    "isFinished true" in {
      assert(Garage.isFinished(List(1,2,3,4,5), List(1,2,3,4,5)) == true)
    }

    "isFinished false" in {
      assert(Garage.isFinished(List(1,2,3,4,5), List(1,2,3,5,4)) == false)
    }
  }

}
