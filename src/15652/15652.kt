package `15652`

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    recur(N, M)
}

fun recur(N: Int, M: Int, list: List<Int> = emptyList()) {
    if (list.size == M) {
        println(list.joinToString(" "))
        return
    }
    for (i in 1..N) {
        if ((list.maxOrNull() ?: 0) <= i) {
            recur(N, M, list + i)
        }
    }
}