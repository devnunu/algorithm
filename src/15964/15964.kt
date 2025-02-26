package `15964`

fun main() {
    var A = 0L
    var B = 0L
    readln().split(" ").map { it.toLong() }.also {
        A = it[0]
        B = it[1]
    }

    println((A + B) * (A - B))
}