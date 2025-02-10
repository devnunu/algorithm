package `18429`

var N = 0
var K = 0
lateinit var list: List<Int>

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it.get(0)
        K = it.get(1)
    }
    list = readln().split(" ").map { it.toInt() }

    println(recur(0, mutableListOf(), 0))
}

fun recur(selectCount: Int, selectedList: MutableList<Int>, totalSum: Int): Int {
    if (selectCount >= N) {
        return 1
    }
    var count = 0
    for (i in 0..<N) {
        val resultSum = totalSum + list[i] - K
        if (selectedList.contains(i) || resultSum < 0) {
            continue
        }
        selectedList.add(i)
        count += recur(selectCount + 1, selectedList, totalSum + list[i] - K)
        selectedList.removeLast()
    }
    return count
}