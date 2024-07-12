package org.example

class StackProblems {
  companion object {
    fun previousSmallerElement(list: IntArray): IntArray {
      val stack = ArrayDeque<Int>()
      val result = IntArray(list.size) { -1 }
      for (i in list.indices) {

        while (stack.isNotEmpty() && stack.last() >= list[i]) {
          stack.removeLast()
        }

        if (stack.isNotEmpty()) {
          result[i] = stack.last()
        }

        stack.addLast(list[i])
      }
      return result
    }
  }
}
