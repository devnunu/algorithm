package `1003`

lateinit var dp: Array<Array<Long>>

fun main() {
    val T = readln().toInt()
    for(t in 1..T) {
        val N = readln().toInt()
        dp = Array(N + 1) { Array(2) { 0 } }

        if (N == 0) {
            println("1 0")
            continue
        } else if (N == 1) {
            println("0 1")
            continue
        }
        dp[0] = arrayOf(1, 0)
        dp[1] = arrayOf(0, 1)

        for (i in 2..N) {
            dp[i] = arrayOf(
                dp[i - 1][0] + dp[i - 2][0],
                dp[i - 1][1] + dp[i - 2][1]
            )
        }

        println(dp[N].joinToString(" "))
    }
}