// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for (i in 1..n) {
    println("#".repeat(i)) // Move to the next line after printing each row
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/