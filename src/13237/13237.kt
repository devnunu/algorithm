package `13237`

fun main() {
    val N = readln().toInt()
    val graph = Array(N + 1) { Array(2) { 0 } }
    val visited = Array(N + 1) { 0 }
    var root = 0
    for (i in 1..N) {
        val nodeValue = readln().toInt()
        if (nodeValue == -1) root = i
        graph[i] = listOf(i, nodeValue).toTypedArray()
    }

    val deque = mutableListOf(graph[root])

    while (deque.isNotEmpty()) {
        val pos = deque.removeAt(0)
        val currentNode = pos.get(0)
        val parentNode = pos.get(1)
        if (parentNode != -1) {
            visited[currentNode] = visited[parentNode] + 1
        }

        for (node in graph) {
            if (node.get(1) == currentNode) {
                deque.add(node)
            }
        }
    }
    visited.drop(1).forEach {
        println(it)
    }
}