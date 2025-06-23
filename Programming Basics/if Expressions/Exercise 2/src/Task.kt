// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int =
  if (number < 0) -1 * number
  else number

fun main() {
  println(abs(-19))  // 19
}