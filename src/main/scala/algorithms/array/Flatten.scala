package algorithms.array

import scala.collection.mutable.ListBuffer


/**
  * Implement Flatten Arrays.
  * Given an array that may contain nested arrays,
  * give a single resultant array.
  */
object Flatten {

  def apply(array: List[Any]): List[Any] = {
    var result = ListBuffer.empty[Any]

    array.foreach(e => result ++= flatten(e))

    result.toList
  }

  private[this] def flatten(e: Any): List[Any] = {
    e match {
      case Nil => Nil
      case head :: rest => flatten(head) ++ flatten(rest)
      case (a, b) => flatten(a) ++ flatten(b)
      case v => List(v)
    }
  }

}
