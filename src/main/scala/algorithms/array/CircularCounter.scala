package algorithms.array


object CircularCounter {

  def apply[? <: Any](array: Array[?], skip: Int, action: (?) => Unit): Unit = {
    if (skip < 1) throw new IllegalArgumentException(s"Skip should be larger than 0 '$skip'")

    var idx: Int = 0
    var copiedArray: Array[?] = array.clone()

    while (copiedArray.length > 0) {
      idx = (skip - 1 + idx) % copiedArray.length
      action(copiedArray.apply(idx))
      val (start, end) = copiedArray.splitAt(idx)
      (start ++ end.drop(1)).copyToArray[?](copiedArray)
      copiedArray = copiedArray.take(copiedArray.length - 1)
    }
  }

}