package `9084`

var N = 0
lateinit var list: List<Int>
lateinit var dp: Array<Array<Int>>

fun main() {
//    val Total = readln().toInt()
//    repeat(Total) {
    N = readln().toInt()
    list = readln().split(" ").map { it.toInt() }
    val targetValue = readln().toInt()
    dp = Array(targetValue + 100) { Array(targetValue + 1) { 0 } }

    // 기본적으로 받은 리스트 값을 하나씩 넣으면 경우의 수가 1이니, 이에 대한 초기값을 세팅함
    for (i in 0..<list.size) {
        dp[1][list[i]] = 1
    }

    var maxCount = 1
    for (moneySum in 0..<targetValue) {
        var isSelected = false
        for (i in 0..<list.size) {
            val coin = list[i]
            if (moneySum - coin < 0) continue
            for (count in 1..<maxCount) {
                dp[count + 1][moneySum] += dp[count][moneySum - coin]
            }
            isSelected = true
        }
        if(isSelected) {
            maxCount += 1
        }
    }

    println(dp.contentDeepToString())


//    }
}

