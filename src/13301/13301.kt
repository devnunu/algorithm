package `13301`

var N = 0
lateinit var dp: Array<Long>

fun main() {
    N = readln().toInt()
    dp = Array<Long>(N + 1) { -1L }

    if (N == 1) {
        println("4")
        return
    }else if(N == 2) {
        println("6")
        return
    }

    dp[1] = 4
    dp[2] = 6

    recur(N)
    println("${dp[N]}")
}

fun recur(n: Int): Long {
    if (n == 1 || n == 2) {
        return dp[n]
    }
    if (dp[n] != -1L) {
        return dp[n]
    }
    dp[n] = recur(n - 1) + recur(n - 2)
    return dp[n]
}