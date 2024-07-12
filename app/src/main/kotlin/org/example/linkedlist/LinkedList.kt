package org.example

class Node<T>(var value: T, var next: Node<T>? = null)

class LinkedList<T> {
  var head: Node<T>? = null

  fun insert(value: T) {
    val newNode = Node(value)
    if (head == null) {
      head = newNode
    } else {
      var temp = head
      while (temp?.next != null) {
        temp = temp.next
      }
      temp?.next = newNode
    }
  }

  fun push(value: T) {

    val newNode = Node(value)
    if (head == null) {
      head = newNode
    } else {
      newNode.next = head
      head = newNode
    }
  }

  fun getNth(n: Int): Node<T>? {
    var i = n
    var cur = head
    while (i > 0 && cur != null) {
      cur = cur.next
      i--
    }
    return cur
  }

  fun length(): Int {
    var count = 0
    var cur = head
    while (cur != null) {
      count++
      cur = cur.next
    }
    return count
  }

  fun lengthRec(h: Node<T>?): Int {
    return if (h == null) {
      0
    } else {
      lengthRec(h.next) + 1
    }
  }

  fun reverse(h: Node<T>? = head): Node<T>? {
    if (h == null || h.next == null) {
      return h
    }

    val newH = reverse(h.next)
    h.next?.next = h
    h.next = null

    return newH
  }

  fun print() {
    var temp = head
    while (temp != null) {
      print(" ${temp.value}-> ")
      temp = temp.next
    }
    println()
  }
}
