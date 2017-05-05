package algorithms.array

/**
  * Given an array of integers, return indices of the two numbers
  * such that they add up to a specific target.
  *
  * You may assume that each input would have exactly one solution,
  * and you may not use the same element twice.
  */
object TwoSum {

  def apply(list: List[Int], target: Int): List[Int] = {
    var map = Map[Int, Int]()

    for ((v, i) <- list.zipWithIndex) {
      map.get(v) match {
        case Some(r) => return List(r, i)
        case None => map ++= Map((target - v) -> i)
      }
    }

    List(-1, -1)
  }

}
