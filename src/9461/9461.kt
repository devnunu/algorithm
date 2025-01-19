package `9461`

var TestCase = 0

fun main() {
    TestCase = readln().toInt()

    for (tc in 0..<TestCase) {
        val N = readln().toInt()
        val dp = Array<Long>(N) { 0 }
        if (N <= 3) {
            println(1)
            continue
        } else if (N <= 5) {
            println(2)
            continue
        }
        dp[0] = 1
        dp[1] = 1
        dp[2] = 1
        dp[3] = 2
        dp[4] = 2

        for (i in 5..<N) {
            dp[i] = dp[i - 5] + dp[i - 1]
        }
        println(dp[N - 1])
    }
}