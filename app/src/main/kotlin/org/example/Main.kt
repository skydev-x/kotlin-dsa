package org.example

import org.example.set.DisjointSet

fun main() {
  val ds = DisjointSet(5)
  ds.union(2, 3)
  ds.union(1, 4)
  ds.union(0, 4)
  ds.union(3, 1)
  println("parent of 0 ${ds.find(0)}")
  println("parent of 1 ${ds.find(1)}")
  println("parent of 2 ${ds.find(2)}")
  println("parent of 3 ${ds.find(3)}")
  println("parent of 4 ${ds.find(4)}")
}
