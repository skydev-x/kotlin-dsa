package org.example.set

class DisjointSet(size: Int) {
  private val parent = Array(size) { it }
  private val rank = Array(size) { 0 }

  fun union(a: Int, b: Int) {
    val pa = find(a)
    val pb = find(b)
    if (pa == pb) return

    parent[pb] = a
  }

  fun find(a: Int): Int {
    if (a == parent[a]) return a
    return find(parent[a])
  }
}
