package algorithms.array

import algorithms.UnitSpec


class LongestNonRepeatTest extends UnitSpec {

  "LongestNonRepeat" should {
    "success" in {
      assert(LongestNonRepeat("abcabcdefbb") == 6)
    }
  }
}
