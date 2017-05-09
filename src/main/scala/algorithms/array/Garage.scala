package algorithms.array

import scala.collection.mutable

/**
  * # There is a parking lot with only one empty spot. Given the initial state
*# of the parking lot and the final state. Each step we are only allowed to
*# move a car
*# out of its place and move it into the empty spot.
*# The goal is to find out the least movement needed to rearrange
*# the parking lot from the initial state to the final state.
 **
 # Say the initial state is an array:
 **
 # [1,2,3,0,4],
*# where 1,2,3,4 are different cars, and 0 is the empty spot.
 **
 # And the final state is
 **
 # [0,3,2,1,4].
*# We can swap 1 with 0 in the initial array to get [0,2,3,1,4] and so on.
*# Each step swap with 0 only.
 **
 Example
  *input : 1, 2, 3, 0, 4
  *final : 0, 3, 2, 1, 4
 **
 answer : 4 steps
 **
 step 1 : 0, 2, 3, 1, 4
  *step 2 : 2, 0, 3, 1, 4 // 없으면 0 제외한 가장 앞에 것과 swap
  *step 3 : 2, 3, 0, 1, 3
  *step 4 : 0, 3, 2, 1, 4
*site : https://discuss.leetcode.com/topic/67928/rearrange-parking-lot
*site : https://www.careercup.com/question?id=5687257423937536
 *
 * User: before30
  * Date: 2017. 5. 9.
  * Time: PM 8:49
  */
object Garage {

  def swap(current: List[Int], emptyIdx: Int, targetIdx: Int): List[Int] = {
    current.updated(emptyIdx, current(targetIdx)).updated(targetIdx, current(emptyIdx))
  }

  def isFinished(currentGarage: List[Int], finalGarage: List[Int]): Boolean = {
    currentGarage == finalGarage
  }

  def calc(initGarage: scala.collection.mutable.MutableList[Int], desigredGarage: List[Int]): Int = {
    var step = 0
    for ( i <- 0 until initGarage.length ) {
      if (initGarage(i) != desigredGarage(i)
        && desigredGarage(i) != 0) {
        val indexOfZero = initGarage.indexOf(0)
        if (i != indexOfZero) {
          val temp = initGarage(i)
          initGarage(i) = 0
          initGarage(indexOfZero) = temp
          step = step + 1
        }
        val indexOfTarget = initGarage.indexOf(desigredGarage(i))
        initGarage(i) = initGarage(indexOfTarget)
        initGarage(indexOfTarget) =  0
        step = step + 1
      }
    }

    step
  }

  def getFirstDeprecntExceptZero(currentGarage: List[Int], finalGarage: List[Int]): Either[String, Int] = {

    Left("nothing")
  }

  def main(args: Array[String]): Unit = {
//    println(swap(List(1,2,3,4,0), 4, 0))
//    println(isFinished(List(1, 2, 3, 4, 5), List(1, 2, 3, 4, 5)))
//    println(isFinished(List(1,2,3,4,5), List(2,1,3,4,5)))

//    println(calc(List(1,2,3,0), List(1,2,3,0)))
    /*
    input : 1, 2, 3, 0, 4
  final : 0, 3, 2, 1, 4

     */
    println(calc(mutable.MutableList(1, 2, 3, 0, 4), List(0, 3, 2, 1, 4)))
  }
}
