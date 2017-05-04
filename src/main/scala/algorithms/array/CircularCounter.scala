package algorithms.array


object CircularCounter {

  def apply[? <: Any](list: List[?], skip: Int, action: (?) => Unit): Unit = {
    if (skip < 1) throw new IllegalArgumentException(s"Skip should be larger than 0 '$skip'")

    var idx: Int = 0
    var copiedList: List[?] = list.drop(0)

    while (copiedList.nonEmpty) {
      idx = (skip - 1 + idx) % copiedList.size
      action(copiedList.apply(idx))
      val (start, end) = copiedList.splitAt(idx)
      copiedList = start ++ end.drop(1)
    }
  }

}
