package `10826`

import java.math.BigInteger

var N = 0
lateinit var dp: Array<BigInteger>

fun main() {
    val N = readln().toInt()
    if (N == 0 || N == 1) {
        println(N)
        return
    }
    dp = Array(N + 1) { BigInteger.valueOf(-1) }
    recur(N)
    println(dp[N])
}

fun recur(n: Int): BigInteger {
    if (n == 0) {
        return BigInteger.ZERO
    }else if(n == 1) {
        return BigInteger.ONE
    }
    if (dp[n] != BigInteger.valueOf(-1)) {
        return dp[n]
    }
    dp[n] = recur(n - 1) + recur(n - 2)
    return dp[n]
}
