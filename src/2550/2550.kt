package `2550`

fun main() {
    val N = readln().toInt()
    val swList = readln().split(" ").map { it.toInt() }
    val lightList = readln().split(" ").map { it.toInt() }

    val pairList = mutableListOf<Pair<Int, Int>>()

    for (i in 0..<N) {
        val pair = (swList.indexOf(lightList[i]) + 1) to i
        pairList.add(pair)
    }

    val updatedSwList = pairList.map { it.first }
    val dp = Array(N) { 1 }

    for (i in 0..<N) {
        for (j in 0..<i) {
            if (updatedSwList[i] > updatedSwList[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    println(dp.max())

    var maxValue = 0
    val resultList = mutableListOf<Int>()
    dp.forEachIndexed { index, item ->
        if (item > maxValue) {
            val mappingIndex = updatedSwList.get(index) - 1
            resultList.add(swList.get(mappingIndex))
            maxValue = item
        }
    }
    resultList.sort()
    println(resultList.joinToString(" "))
}