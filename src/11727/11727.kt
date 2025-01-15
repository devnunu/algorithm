package `11727`

lateinit var dp: Array<Int>
var N = 0

fun main() {
    N = readln().toInt()
    dp = Array(N) { 0 }

    recur(0)
    println(dp[0])
}

fun recur(index: Int): Int {
    if (index == N) {
        return 1
    }
    if (index > N) {
        return 0
    }
    if (dp[index] != 0) {
        return dp[index]
    }
    dp[index] = (recur(index + 1) + recur(index + 2) + recur(index + 2)) % 10007
    return dp[index]
}