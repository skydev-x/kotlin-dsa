package org.example.recursion

object Recursion {

  fun printNumbers(n: Int) {
    if (n == 0) {
      return
    }
    printNumbers(n - 1)
    println(n)
  }

  fun factorial(n: Int): Int {
    if (n == 0) {
      return 1
    }
    return n * factorial(n - 1)
  }

  fun subsets(input: String): List<String> {
    val result = mutableListOf<String>()
    fun util(input: String, start: Int, result: MutableList<String>, cur: String = "") {
      if (start == input.length) {
        result.add(cur)
        return
      }

      util(input, start + 1, result, cur + input[start])
      util(input, start + 1, result, cur)
    }
    util(input, 0, result)
    return result
  }
}
