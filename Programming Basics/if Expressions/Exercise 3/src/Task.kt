// IfExpressions/Task3.kt
package ifExpressionsExercise3

fun findMax(first: Int, second: Int): Int =
    first.coerceAtLeast(second)

fun main() {
  println(findMax(-1, 4))  // 4
}