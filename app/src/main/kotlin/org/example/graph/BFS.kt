package org.example.graph

fun Graph.bfs(v: Int) {
  val size = this.getAllVertices().size
  val visited = Array(size) { false }
  val queue = ArrayDeque<Int>()
  val result = mutableListOf<Int>()
  queue.addLast(v)
  while (queue.isNotEmpty()) {
    val front = queue.removeFirst()
    if (!visited[front]) {
      result.add(front)
      visited[front] = true
      for (neighbour in this.getNeighbours(front)) {
        if (!visited[neighbour]) {
          queue.addLast(neighbour)
        }
      }
    }
  }

  println(result)
}
