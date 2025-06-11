// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  return ('a'..'z').joinToString("")
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}