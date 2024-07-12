package org.example

class Stack<T> {

  private val st = ArrayDeque<T>()

  fun pop(): T? {
    val popped = st.removeLastOrNull()
    return popped
  }

  fun push(e: T) {
    st.addLast(e)
  }

  fun peek(): T? {
    return st.lastOrNull()
  }

  fun empty(): Boolean {
    return st.isEmpty()
  }

  fun size(): Int {
    return st.size
  }

  fun print() {
    for (i in st.reversed()) {
      println(i)
    }
  }
}
