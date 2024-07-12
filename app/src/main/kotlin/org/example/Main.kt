package org.example

import org.example.graph.Graph
import org.example.graph.bfs
import org.example.graph.dfs

fun main() {

  val graph = Graph()
  graph.addEdge(1, 2)
  graph.addEdge(2, 3)
  graph.addEdge(1, 3)
  graph.addEdge(3, 4)
  graph.addEdge(3, 5)
  graph.addEdge(1, 0)
  graph.printGraph()
  graph.dfs(3)
  graph.bfs(3)
}
