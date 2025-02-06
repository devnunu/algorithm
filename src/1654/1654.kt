package `1654`

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Long>()
    repeat(N) {
        list.add(readln().toLong())
    }
    list.sort()

    var lo = 1L
    var hi = list.last()
    var result = 0L

    while (lo <= hi) {
        val mid = (lo + hi) / 2

        var count = 0L
        for (i in 0..<list.size) {
            count += list[i] / mid
        }
        if (count >= K) {
            result = maxOf(result, mid)
            lo = mid + 1
        } else {
            hi = mid - 1
        }
    }
    println(result)
}