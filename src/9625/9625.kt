package `9625`

var N = 0
lateinit var dp: IntArray

fun main() {
    N = readln().toInt()
    dp = IntArray(N + 1) { -1 }

    if (N == 1) {
        println("0 1")
        return
    } else if (N == 2) {
        println("1 1")
        return
    }

    recur(N)
    println("${dp[N - 1]} ${dp[N]}")
}

fun recur(n: Int): Int {
    if (n == 1 || n == 2) {
        dp[n] = 1
        return 1
    }
    if (dp[n] != -1) {
        return dp[n]
    }
    dp[n] = recur(n - 1) + recur(n - 2)
    return dp[n]
}