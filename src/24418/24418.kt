package `24418`

var recurCnt = 0
var dpRecurCnt = 0
lateinit var dp: Array<IntArray>

fun main() {
    val N = readln().toInt()
    val map = Array(N) { IntArray(N) { 0 } }
    dp = Array(N) { IntArray(N) { -1 } }

    for (i in 0..<N) {
        map[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    recurCnt = 1
    recur(map, 0, 0)

    dpRecurCnt = 0
    dpRecur(map, 0, 0)
    println("$recurCnt $dpRecurCnt")

}

fun recur(map: Array<IntArray>, y: Int, x: Int): Int {
    return if (y == map.size || x == map.size) {
        0
    } else {
        recurCnt += 1
        map[y][x] + maxOf(recur(map, y + 1, x), recur(map, y, x + 1))
    }
}

fun dpRecur(map: Array<IntArray>, y: Int, x: Int): Int {
    if (y == map.size || x == map.size) {
        return 0
    }
    if (dp[y][x] != -1) {
        return dp[y][x]
    }
    dpRecurCnt += 1
    dp[y][x] = map[y][x] + maxOf(dpRecur(map, y + 1, x), dpRecur(map, y, x + 1))
    return dp[y][x]
}