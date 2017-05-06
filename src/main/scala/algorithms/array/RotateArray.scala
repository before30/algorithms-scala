package algorithms.array

/**
  * Rotate an array of n elements to the right by k steps.
  */
object RotateArray {

  def apply[T](list: List[T], k: Int): List[T] = {
    if (k < 0) throw new IllegalArgumentException(s"k should not be negative '$k'")

    val step = k % list.size

    list.drop(step) ++ list.take(step)
  }

}
