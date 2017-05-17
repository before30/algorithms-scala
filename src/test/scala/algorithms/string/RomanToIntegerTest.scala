package algorithms.string

import algorithms.UnitSpec

/**
  * Created by before30 on 16/05/2017.
  */
/*
* MMMMCCCXII -> 4312
  * DXXI -> 521
  * XLIX -> 49
 */

class RomanToIntegerTest extends UnitSpec {
  "Roman To Integer" when {
    "MMMMCCCXII" in {
      assert(RomanToInteger("MMMMCCCXII") == 4312)
    }

    "XLIX" in {
      assert(RomanToInteger("DXXI") == 521)
    }

    "DXXI" in {
      assert(RomanToInteger("XLIX") == 49)
    }
  }

}
