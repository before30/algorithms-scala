package algorithms.array

import algorithms.UnitSpec


class FlattenTest extends UnitSpec {

  "Flatten" should {

    "success" in {
      assert(Flatten(List(1, 2, List(3, 4), (5, 6))) == List(1, 2, 3, 4, 5, 6))
    }

  }
}
