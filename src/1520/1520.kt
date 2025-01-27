package `1520`

var N = 0 // 가로
var M = 0 // 세로
lateinit var mapArray: Array<Array<Int>>
lateinit var dp: Array<Array<Int>>
val directionList = listOf(listOf(0, 1), listOf(0, -1), listOf(1, 0), listOf(-1, 0))

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    M = list[0]
    N = list[1]
    mapArray = Array(M) { Array(N) { 0 } }
    dp = Array(M) { Array(N) { -1 } }
    for (i in 0..<M) {
        mapArray[i] = readln().split(" ").map { it.toInt() }.toTypedArray()
    }
    val result = recur(0, 0)
    println(result)
}

fun recur(y: Int, x: Int): Int {
    if (y == M - 1 && x == N - 1) {
        return 1
    }
    if (dp[y][x] != -1) {
        return dp[y][x]
    }
    var point = 0
    for (arr in directionList) {
        val dy = y + arr[0]
        val dx = x + arr[1]

        if (dy in 0..<M && dx in 0..<N) {
            if (mapArray[y][x] > mapArray[dy][dx]) {
                point += recur(dy, dx)
            }
        }
    }
    dp[y][x] = point
    return dp[y][x]
}