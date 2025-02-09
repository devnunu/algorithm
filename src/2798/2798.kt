package `2798`

var N = 0
var M = 0
lateinit var list: IntArray

var max = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it[0]
        M = it[1]
    }
    list = readln().split(" ").map { it.toInt() }.toIntArray()

    recur(0, mutableListOf())
    println(max)
}

fun recur(count: Int, sumList: List<Int>): Int {
    if (count > 2) {
        val sum = sumList.sum()
        return if (sum > M) {
            0
        } else {
            sum
        }
    }
    for (num in list) {
        if (sumList.contains(num)) continue
        val result = recur(count + 1, sumList + num)
        max = maxOf(result, max)
    }
    return max
}
