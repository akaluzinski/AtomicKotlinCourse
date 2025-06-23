// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var results = 1L
  for (i in 1..n) {
    results *= i
  }
  return results
}

fun main() {
  println(factorial(10))  // 3628800
}