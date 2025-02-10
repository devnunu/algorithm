package `2529`

var N = 0
lateinit var list: List<String>
lateinit var maxList: Array<Int>
lateinit var minList: Array<Int>

fun main() {
    N = readln().toInt()
    list = readln().split(" ")
    maxList = Array(N) { 0 }
    minList = Array(N) { 10 }

    for (num in 0..9) {
        recur(0, num, listOf(num))
    }
    println(maxList.joinToString("") { it.toString() })
    println(minList.joinToString("") { it.toString() })
}

fun recur(idx: Int, prev: Int, resultList: List<Int>) {
    if (idx >= N) {
        val resultNum = resultList.joinToString("") { it.toString() }.toLong()
        val maxNum = maxList.joinToString("") { it.toString() }.toLong()
        val minNum = minList.joinToString("") { it.toString() }.toLong()
        if (resultNum > maxNum) {
            maxList = resultList.toTypedArray()
        }
        if (resultNum < minNum) {
            minList = resultList.toTypedArray()
        }
        return
    }
    if (list[idx] == "<") {
        for (num in prev + 1..9) {
            if(resultList.contains(num)) {
                continue
            }
            recur(idx + 1, num, resultList + num)
        }
    } else {
        for (num in 0..<prev) {
            if(resultList.contains(num)) {
                continue
            }
            recur(idx + 1, num, resultList + num)
        }
    }
}