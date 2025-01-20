package `11722`

var N = 0
lateinit var list: List<Int>
lateinit var dp: Array<Array<Int>>

fun main() {
    N = readln().toInt()
    list = readln().split(" ").map { it.toInt() }
    dp = Array(N) { Array(1002) { -1 } }

    val result = recur(0, 1001)
    if (result == 0) {
        println(1)
    } else {
        println(result)
    }
}

fun recur(index: Int, previousNumber: Int): Int {
    if (index == N) {
        return 0
    }
    if (dp[index][previousNumber] != -1) {
        return dp[index][previousNumber]
    }

    // 선택을 안 한 경우
    var maxLen = recur(index + 1, previousNumber)

    if (previousNumber > list[index]) {
        maxLen = maxOf(
            // 선택을 한 경우
            recur(index + 1, list[index]) + 1,
            maxLen
        )
    }
    dp[index][previousNumber] = maxLen
    return maxLen
}


//var N = 0
//lateinit var list: List<Int>
//lateinit var dp: Array<Int>
//fun main() {
//    N = readln().toInt()
//    list = readln().split(" ").map { it.toInt() }
//    dp = Array(N) { 0 }
//
//    recur(0, Int.MAX_VALUE)
//    if (dp[0] == 0) {
//        println(1)
//    } else {
//        println(dp[0])
//    }
//}
//
//fun recur(index: Int, previousNumber: Int): Int {
//    if (index == N) {
//        return 0
//    }
//    if (previousNumber > list[index]) {
//        if (dp[index] != 0) {
//            return dp[index]
//        }
//        dp[index] = Math.max(
//            // 선택한 케이스
//            recur(index + 1, list[index]) + 1,
//            // 선택안 한 케이스
//            recur(index + 1, previousNumber)
//        )
//        return dp[index]
//    }
//
//    return recur(index + 1, previousNumber)
//}