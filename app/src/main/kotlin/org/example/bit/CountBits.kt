package org.example

import java.util.Stack

class BitsUtils {

  companion object {

    fun countBits(n: Int) {
      var count = 0
      var num = n
      while (num > 0) {
        count += num.and(1)
        num = num.shr(1)
      }
      println("$n has $count bits set")
      val stack = Stack<Int>()
      stack.push(1)
      stack.push(2)

      for (i in 0 until stack.size) {
        println(stack.pop())
      }
    }
  }
}
