package naver

var N = 0
lateinit var list: Array<Int>

fun main() {
    list = readln().split(" ").map { it.toInt() }.toTypedArray()
    N = list.size

    var max = 0
    for (i in 0..<N) {
        max = maxOf(recur(i), max)
    }
    println(max + 1)
}

fun recur(idx: Int): Int {
    if (idx == 0 || idx == N - 1) {
        return 0
    }
    var result = 0
    if (list[idx - 1] >= list[idx]) {
        result = recur(idx - 1) + 1
    }
    if (list[idx + 1] >= list[idx]) {
        result = recur(idx + 1) + 1
    }
    return result
}