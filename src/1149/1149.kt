package `1149`

var N = 0

fun main() {
    N = readln().toInt()

    val array = Array(N) { Array(3) { 0 } }
    val dp = Array(N + 1) { Array(3) { 0 } }

    for (i in 0..<N) {
        array[i] = readln().split(" ").map { it.toInt() }.toTypedArray()
    }

    for (i in 1..N) {
        dp[i][0] = minOf(dp[i - 1][1], dp[i - 1][2]) + array[i - 1][0]
        dp[i][1] = minOf(dp[i - 1][0], dp[i - 1][2]) + array[i - 1][1]
        dp[i][2] = minOf(dp[i - 1][0], dp[i - 1][1]) + array[i - 1][2]
    }
    println(minOf(minOf(dp[N][0], dp[N][1]), dp[N][2]))
}