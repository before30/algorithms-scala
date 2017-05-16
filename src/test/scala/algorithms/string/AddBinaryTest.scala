package algorithms.string

import algorithms.UnitSpec

/**
  * Created by before30 on 16/05/2017.
  */
class AddBinaryTest extends UnitSpec {
  "AddBinary" when {
    "1111, 1" in {
      assert(AddBinary("1111", "1") == "10000")
    }

    "0, 0" in {
      assert(AddBinary("1111", "1") == "10000")
    }

    "1, 1" in {
      assert(AddBinary("1", "1") == "10")
    }

    "1101, 11" in {
      assert(AddBinary("1101", "11") == "10000")
    }

    "1, 1111" in {
      assert(AddBinary("1", "1111") == "10000")

    }

    "001, 100" in {
      assert(AddBinary("001", "100") == "101")
    }
  }

}
