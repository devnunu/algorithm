package `9372`

var N = 0
var M = 0
lateinit var graph: Array<MutableList<Int>>
lateinit var visited: IntArray
var count = 0

fun main() {
    val T = readln().toInt()

    repeat(T) {
        readln().split(" ").map { it.toInt() }.also {
            N = it[0]
            M = it[1]
        }
        graph = Array(N + 1) { mutableListOf() }
        visited = IntArray(N + 1) { 0 }

        repeat(M) {
            val (a, b) = readln().split(" ").map { it.toInt() }
            graph[a].add(b)
            graph[b].add(a)
        }

        count = 0
        recur(1)
        println(count - 1)
    }
}

fun recur(node: Int) {
    if (visited[node] == 1) {
        return
    }
    count += 1
    visited[node] = 1
    for (nxt in graph[node]) {
        recur(nxt)
    }
}