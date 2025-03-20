package `1463_2`

var N = 0
lateinit var dp: IntArray
fun main() {
    N = readln().toInt()
    dp = IntArray(N + 1) { -1 }

    dp[1] = 0

    for (i in 2..N) {
        dp[i] = dp[i-1] + 1  // 1을 빼는 연산

        if (i % 2 == 0) {
            dp[i] = minOf(dp[i], dp[i/2] + 1)
        }

        if (i % 3 == 0) {
            dp[i] = minOf(dp[i], dp[i/3] + 1)
        }
    }

    println(dp[N])
}

