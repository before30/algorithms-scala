package algorithms.array

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
