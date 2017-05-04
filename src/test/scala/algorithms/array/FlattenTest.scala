package algorithms.array

import algorithms.UnitSpec


class FlattenTest extends UnitSpec {

  "Flatten" should {

    "success" in {
      println(Flatten(List(1, 2, List(3, 4), (5, 6))))
    }

  }
}
