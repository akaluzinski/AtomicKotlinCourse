// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  return !s.isEmpty() && (s[0].isLetter() || s[0] == '_')
          && s.all { it.isLetterOrDigit() || it == '_' }
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}