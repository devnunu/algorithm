package `1018`

//lateinit var dp: Array<IntArray>
//
//fun main() {
//    val (N, M) = readln().split(" ").map { it.toInt() }
//    val array = Array(N) { Array(M) { "" } }
//    val dp = Array(N) { IntArray(M) { -1 } }
//    repeat(N) { i ->
//        array[i] = readln().split(" ").toTypedArray()
//    }
//
//    array.toList().forEach {
//        println(it.contentToString())
//    }
//}
//
//fun recur(y: Int, x: Int, count: Int): Int {
//    if (y >= 8 || x >= 8) {
//        return count
//    }
//    if (dp[y][x] == -1) {
//        dp[y][x]
//    }
//    recur(y + 1, x, count)
//}