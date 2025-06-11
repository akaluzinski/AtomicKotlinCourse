// InKeyword/Task2.kt
package theInKeywordExercise2

fun sumOfEven(n: Int): Int {
  return (0..n step 2).sum()
}

fun main() {
  println(sumOfEven(10))  // 30
}