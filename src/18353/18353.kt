package `18353`

fun main() {
    val N = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val dp = Array(N) { 1 }

    for (i in 0..<N) {
        for (j in 0..<i) {
            if (list[j] > list[i]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }
    println(N - dp.max())
}