package `15650`

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }

    recur(N, M)
}

fun recur(n: Int, m: Int, list: List<Int> = emptyList()) {
    if (list.size == m) {
        println(list.joinToString(" "))
        return
    }
    for (i in 1..n) {
        if (!list.contains(i) && (list.maxOrNull() ?: 0) < i) {
            recur(n, m, list + i)
        }
    }
}
