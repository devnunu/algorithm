package `11722`

var N = 0
lateinit var list: List<Int>
lateinit var dp: Array<Int>

fun main() {
    N = readln().toInt()
    list = readln().split(" ").map { it.toInt() }
    dp = Array(N) { 0 }

    recur(0, Int.MAX_VALUE)
    if (dp[0] == 0) {
        println(1)
    } else {
        println(dp[0])
    }
}

fun recur(index: Int, previousNumber: Int): Int {
    if (index == N) {
        return 0
    }
    if (previousNumber > list[index]) {
        if (dp[index] != 0) {
            return dp[index]
        }
        dp[index] = Math.max(
            // 선택한 케이스
            recur(index + 1, list[index]) + 1,
            // 선택안 한 케이스
            recur(index + 1, previousNumber)
        )
        return dp[index]
    }

    return recur(index + 1, previousNumber)
}