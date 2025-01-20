package `1463`

lateinit var dp: Array<Int>

fun main() {
    val N = readln().toInt()

    dp = Array(N + 1) { 0 }

    if (N == 1) {
        println("0")
        return
    }
    if (N < 4) {
        println("1")
        return
    }
    dp[0] = 1
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1

    for (i in 4..N) {
        var result = dp[i - 1] + 1
        if (i % 2 == 0) {
            result = minOf(result, dp[i / 2] + 1)
        }
        if (i % 3 == 0) {
            result = minOf(result, dp[i / 3] + 1)
        }
        dp[i] = result
    }

    println(dp[N])
}