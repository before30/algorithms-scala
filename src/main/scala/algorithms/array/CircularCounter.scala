package algorithms.array

/**
  * There are people sitting in a circular fashion,
  * print every third member while removing them,
  * the next counter starts immediately after the member is removed.
  * Print till all the members are exhausted.
  */
object CircularCounter {

  def apply[T <: Any](list: List[T], skip: Int, action: (T) => Unit): Unit = {
    if (skip < 1) throw new IllegalArgumentException(s"Skip should be larger than 0 '$skip'")

    var idx: Int = 0
    var copiedList: List[T] = list.drop(0)

    while (copiedList.nonEmpty) {
      idx = (skip - 1 + idx) % copiedList.size
      action(copiedList.apply(idx))
      val (start, end) = copiedList.splitAt(idx)
      copiedList = start ++ end.drop(1)
    }
  }

}
