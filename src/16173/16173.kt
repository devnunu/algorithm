package `16173`

var N = 0
lateinit var map: Array<Array<Int>>
lateinit var dp: Array<Array<Int>>

fun main() {
    N = readln().toInt()
    map = Array(N) { Array(N) { 0 } }
    dp = Array(N) { Array(N) { -1 } }

    for (i in 0..<N) {
        map[i] = readln().split(" ").map { it.toInt() }.toTypedArray()
    }

    recur(0, 0)
    if (dp[N - 1][N - 1] > 0) {
        println("HaruHaru")
    } else {
        println("Hing")
    }
}

fun recur(y: Int, x: Int): Int {
    if (x == N - 1 && y == N - 1) {
        dp[y][x] = 1
        return dp[y][x]
    }
    if (dp[y][x] != -1) {
        return dp[y][x]
    }
    val curValue = map[y][x]
    if (curValue == 0) {
        return -1
    }
    for (pos in listOf(0 to curValue, curValue to 0)) {
        if (y + pos.first < N && x + pos.second < N) {
            recur(y + pos.first, x + pos.second)
        }
    }
    dp[y][x] = 1
    return dp[y][x]
}