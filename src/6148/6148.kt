package `6148`

var N = 0
var B = 0
lateinit var list: IntArray
lateinit var dp: IntArray

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it[0]
        B = it[1]
    }
    list = IntArray(N) { 0 }
    dp = IntArray(N) { Int.MAX_VALUE }

    for (i in 0..<N) {
        list[i] = readln().toInt()
    }

    println(recur(0, 0))
}

fun recur(idx: Int, sum: Int): Int {
    if (idx == N) {
        if (sum - B >= 0) {
            return sum - B
        } else {
            return Int.MAX_VALUE
        }
    }
    return minOf(
        // 선택하는 경우
        recur(idx + 1, sum + list[idx]),
        // 선택하지 않는 경우
        recur(idx + 1, sum)
    )
}