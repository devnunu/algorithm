package `11060`

var N = 0
lateinit var array: Array<Int>
lateinit var dp: Array<Int>
fun main() {
    N = readln().toInt()
    array = readln().split(" ").map { it.toInt() }.toTypedArray()
    dp = Array(N) { -1 }

    val result = recur(0)
    if (result == 1001) {
        println(-1)
    } else {
        println(result)
    }
}

fun recur(idx: Int): Int {
    if (idx >= N) return 1001
    else if (idx == N - 1) return 0

    if (dp[idx] != -1) return dp[idx]

    var minJumpCount = 1001
    for (i in 1..array[idx]) {
        val result = recur(idx + i) + 1
        minJumpCount = minOf(
            result,
            minJumpCount
        )
    }
    dp[idx] = minJumpCount
    return dp[idx]
}