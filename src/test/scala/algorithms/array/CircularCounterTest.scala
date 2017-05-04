package algorithms.array

import algorithms.UnitSpec


class CircularCounterTest extends UnitSpec {

  "CircularCounter" when {

    "skip value is positive" should {
      "works fine" in {
        var list = List[Int]()
        CircularCounter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9), 3, v => list = list ++ List(v))
        assert(list == List(3, 6, 9, 4, 8, 5, 2, 7, 1))
      }
    }

    "skip value is negative" should {
      "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
          CircularCounter[Int](List(), -1, _ => {})
        }
      }
    }

  }
}
