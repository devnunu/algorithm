package `14916`

var N = 0
lateinit var dp: Array<Long>
fun main() {
    N = readln().toInt()
    dp = Array<Long>(N) { Long.MAX_VALUE }

    if (N == 1 || N == 3) {
        println(-1)
        return
    }

    recur(0, N)
    println(dp[0])
}

fun recur(count: Int, remain: Int): Long {
    if (remain == 0) {
        return count.toLong()
    } else if (remain < 0) {
        return Long.MAX_VALUE
    }
    if (dp[count] != Long.MAX_VALUE) {
        return dp[count]
    }
    val result = minOf(
        recur(count + 1, remain - 5),
        recur(count + 1, remain - 2)
    )
    dp[count] = minOf(result, dp[count])
    return dp[count]
}