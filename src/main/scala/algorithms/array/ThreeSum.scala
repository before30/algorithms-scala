package algorithms.array

/**
  * Given an array S of n integers, are there elements a, b, c in S
  * such that a + b + c = 0?
  * Find all unique triplets in the array which gives the sum of zero.
  *
  * Note: The solution set must not contain duplicate triplets.
  *
  * For example, given array S = [-1, 0, 1, 2, -1, -4],
  *
  * A solution set is:
  * [
  * [-1, 0, 1],
  * [-1, -1, 2]
  * ]
  */
object ThreeSum {

  def apply(list: List[Int]): Set[List[Int]] = {
    if (list.size < 3) throw new IllegalArgumentException(s"Size of input list is less than 3")

    val source = list.sorted
    var solutionSet: Set[List[Int]] = Set.empty
    for (i <- 0 until list.size - 2) {

      if (!(i > 0 && source.apply(i) == source.apply(i - 1))) {
        var (l: Int, r: Int) = (i + 1, list.size - 1)

        while (l < r) {
          val s = source.apply(i) + source.apply(l) + source.apply(r)
          if (s > 0) {
            r -= 1
          } else if (s < 0) {
            l += 1
          } else {
            solutionSet += List(source.apply(i), source.apply(l), source.apply(r))
            while (l < r && source.apply(l) == source.apply(l + 1)) {
              l += 1
            }
            while (l < r && source.apply(r) == source.apply(r - 1)) {
              r -= 1
            }
            l += 1
            r -= 1
          }
        }
      }
    }

    solutionSet
  }

}
