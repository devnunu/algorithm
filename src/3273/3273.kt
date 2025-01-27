package `3273`

fun main() {
    val N = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.sorted()
    val M = readln().toInt()

    var s = 0
    var e = N - 1
    var count = 0

    while (s < e) {
        if (list[s] + list[e] == M) {
            count += 1
            e -= 1
            s += 1
        }
        if (list[s] + list[e] > M) {
            e -= 1
        } else if (list[s] + list[e] < M) {
            s += 1
        }
    }
    println(count)
}