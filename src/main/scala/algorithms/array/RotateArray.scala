package algorithms.array

/**
  * Rotate an array of n elements to the right by k steps.
  */
object RotateArray {

  def dropAndTake[T](list: List[T], k: Int): List[T] = {
    if (k < 0) throw new IllegalArgumentException(s"k should not be negative '$k'")

    val step = list.size - k % list.size

    list.drop(step) ++ list.take(step)
  }

  def updated[T](list: List[T], k: Int): List[T] = {
    if (k < 0) throw new IllegalArgumentException(s"k should not be negative '$k'")

    var result = list.drop(0)

    for ((elem, i) <- list.zipWithIndex) {
      result = result.updated((i + k) % result.size, elem)
    }

    result
  }

}
