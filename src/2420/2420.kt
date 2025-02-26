package `2420`

import kotlin.math.abs

fun main() {
    var A = 0L
    var B = 0L
    readln().split(" ").map { it.toLong() }.also {
        A = it.get(0)
        B = it.get(1)
    }
    println(abs(A - B))
}