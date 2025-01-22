package `2565`

fun main() {
    val N = readln().toInt()
    val array = Array(N) { Array(2) { 0 } }
    for (i in 0..<N) {
        array[i] = readln().split(" ").map { it.toInt() }.toTypedArray()
    }
    array.sortBy { it.get(0) }
    val list = array.map { it.get(1) }
    val dp = Array(N) { 1 }

    for (i in 0..<N) {
        for (j in 0..<i) {
            if (list[i] > list[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    println(N - dp.max())
}