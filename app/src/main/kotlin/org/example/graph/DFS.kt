package org.example.graph

fun Graph.dfs(v: Int) {
  val size = this.getAllVertices().size
  val visited = Array(size) { false }
  val result = mutableListOf<Int>()

  fun rec(v: Int) {
    result.add(v)
    visited[v] = true
    for (neighbour in this.getNeighbours(v)) {
      if (!visited[neighbour]) {
        rec(neighbour)
      }
    }
  }
  rec(v)

  println(result)
}
