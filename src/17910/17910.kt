package `17910`

var N = 0
lateinit var list: List<Long>

fun main() {
    N = readln().toInt()
    list = readln().split(" ").map { it.toLong() }

    if (N == 1) {
        println(list[0])
        return
    }

    val result = recur(0)
    println("${result.first}/${result.second}")
}

fun recur(idx: Int): Pair<Long, Long> {
    if (idx == N - 1) {
        return list[idx] to 1
    }
    val result = recur(idx + 1)
    return list[idx] * result.first + result.second to result.first
}