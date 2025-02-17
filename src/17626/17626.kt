package `17626`

var N = 0
lateinit var dp: IntArray
fun main() {
    N = readln().toInt()
    dp = IntArray(N) { -1 }
    recur(0, 0, 0)
    println(dp.contentToString())
}

fun recur(num: Int, sum: Int, count: Int): Int {
    if (sum == N) {
        return count
    } else if (num >= N) {
        return Int.MAX_VALUE
    }

    if (dp[num] != -1) {
        return dp[num]
    }

    dp[num] = minOf(
        recur(num + 1, sum + (num * num), count + 1),
        recur(num + 1, sum, count)
    )
    return dp[num]
}