package `9095`

lateinit var dp: IntArray

fun main() {
    val N = readln().toInt()

    repeat(N) {
        val num = readln().toInt()
        if (num == 1 || num == 2) {
            println(num)
        } else if (num == 3) {
            println(4)
        } else {
            dp = IntArray(num + 1) { -1 }
            dp[1] = 1
            dp[2] = 2
            dp[3] = 4

            for (i in 4..num) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
            }
            println(dp[num])
        }
    }
}