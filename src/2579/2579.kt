package `2579`

var N = 0
lateinit var dp: Array<Long>
val list = mutableListOf<Long>()

fun main() {
    N = readln().toInt()
    list.add(0)
    repeat(N) {
        list.add(readln().toLong())
    }
    dp = Array(N + 1) { 0 }

    recur(0, 0)
    println(dp.contentDeepToString())
}

fun recur(index: Int, seqCount: Int): Long {
    if (seqCount == 3) {
        return 0
    }
    if (index == N) {
        return list[index]
    }
    if (index > N) {
        return 0
    }

    if (dp[index] != 0L) {
        return dp[index]
    }

    dp[index] = list[index] + Math.max(
        recur(index + 1, seqCount + 1),
        recur(index + 2, 1)
    )
    return dp[index]
}