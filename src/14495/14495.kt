package `14495`

var N = 0
lateinit var dp: Array<Long>

fun main() {
    N = readln().toInt()
    if (N == 0 || N == 1 || N == 2) {
        println(1)
        return
    }
    dp = Array<Long>(N + 1) { -1 }
    println(recur(N - 1))
}

fun recur(n: Int): Long {
    if (n == 0 || n == 1 || n == 2) {
        return 1
    }
    if (dp[n] != -1L) {
        return dp[n]
    }
    dp[n] = recur(n - 1) + recur(n - 3)
    return dp[n]
}