package org.example.graph

class Graph {

  private val adjacencyList = mutableMapOf<Int, MutableList<Int>>()

  fun addVertex(v: Int) {
    if (!adjacencyList.containsKey(v)) {
      adjacencyList[v] = mutableListOf<Int>()
    }
  }

  fun removeVertex(v: Int) {
    if (adjacencyList.containsKey(v)) {
      adjacencyList.remove(v)
      adjacencyList.values.forEach { it.remove(v) }
    }
  }

  fun addEdge(v1: Int, v2: Int) {
    addVertex(v1)
    addVertex(v2)
    adjacencyList[v1]?.add(v2)
    adjacencyList[v2]?.add(v1)
  }

  fun removeEdge(v1: Int, v2: Int) {
    adjacencyList[v1]?.remove(v2)
    adjacencyList[v2]?.remove(v1)
  }

  fun getNeighbours(v: Int): MutableList<Int> {
    return adjacencyList[v] ?: mutableListOf<Int>()
  }

  fun hasEdge(vertex1: Int, vertex2: Int): Boolean {
    return adjacencyList[vertex1]?.contains(vertex2) == true
  }

  fun getAllVertices(): Set<Int> {
    return adjacencyList.keys
  }

  fun printGraph() {
    adjacencyList.forEach { (vertex, neighbors) ->
      println("$vertex -> ${neighbors.joinToString(", ")}")
    }
  }
}
