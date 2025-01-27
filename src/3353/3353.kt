package `3353`

/**
 * 메모리 초과, 이진 탐색으로 풀어야할듯
 * */
fun main() {
    val N = readln().toInt()
    // array 대신 바로 list 생성
    val pairs = mutableListOf<Pair<Int, Int>>()

    repeat(N) {
        val (x1, x2) = readln().split(" ").map { it.toInt() }
        pairs.add(x1 to x2)
    }

    pairs.sortBy { it.first }

    val list = MutableList(N) { pairs[it].second }

    pairs.clear()

    val dp = Array(N) { 1 }

    for (i in 0..<N) {
        for (j in 0..<i) {
            if (list[i] > list[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    println(N + 1 - dp.max())
}