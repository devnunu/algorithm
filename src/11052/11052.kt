package `11052`

var N = 0
lateinit var list: List<Int>
lateinit var dp: Array<Int>

fun main() {
    N = readln().toInt()
    list = readln().split(" ").map { it.toInt() }
    dp = Array(N) { -1 }

    var maxAmount = 0
    for (i in 0..<list.size) {
        val result = recur(list[i], i + 1, listOf(list[i]))
        maxAmount = maxOf(maxAmount, result)
    }
    println(maxAmount)
}

fun recur(totalAmount: Int, totalCardCount: Int, pickList: List<Int>): Int {
    if (totalCardCount == N) {
        println("pickList:${pickList}")
        println("totalCardCount:${totalCardCount}")
        return totalAmount
    } else if (totalCardCount > N) {
        return 0
    }
    if (dp[totalCardCount] != -1) {
        return dp[totalCardCount]
    }
    var maxAmount = 0
    for (i in 0..<list.size) {
        val result = recur(totalAmount + list[i], totalCardCount + (i + 1), pickList + list[i])
        maxAmount = maxOf(maxAmount, result)
    }
    dp[totalCardCount] = maxAmount
    return dp[totalCardCount]
}