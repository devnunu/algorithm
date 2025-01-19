package `11722`

//var N = 0
//lateinit var list: List<Int>
//lateinit var dp: Array<Int>
//
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

var N = 0
lateinit var list: List<Int>
lateinit var dp: Array<Array<Int>>  // 2차원 배열로 변경

fun main() {
    N = readln().toInt()
    list = readln().split(" ").map { it.toInt() }
    dp = Array(N) { Array(1001) { -1 } }  // previousNumber 값도 저장할 수 있도록 변경

    println(recur(0, Int.MAX_VALUE))
}

fun recur(index: Int, previousNumber: Int): Int {
    if (index == N) {
        return 0
    }

    // previousNumber가 Int.MAX_VALUE인 경우는 1000으로 처리
    val prevNum = if (previousNumber == Int.MAX_VALUE) 1000 else previousNumber

    if (dp[index][prevNum] != -1) {
        return dp[index][prevNum]
    }

    var maxLen = recur(index + 1, previousNumber)  // 현재 수를 선택하지 않는 경우

    if (previousNumber > list[index]) {
        maxLen = maxOf(maxLen, recur(index + 1, list[index]) + 1)  // 현재 수를 선택하는 경우
    }

    dp[index][prevNum] = maxLen
    return maxLen
}