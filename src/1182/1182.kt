package `1182`

var N = 0
var S = 0
lateinit var list: List<Int>
var count = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it.get(0)
        S = it.get(1)
    }
    list = readln().split(" ").map { it.toInt() }

    recur(0, listOf())
    println(count)
}

fun recur(idx: Int, sumList: List<Int>) {
    if (idx == N) {
        if (sumList.isNotEmpty() && sumList.sum() == S) {
            count += 1
        }
        return
    }
    recur(idx + 1, sumList)
    recur(idx + 1, sumList + list[idx])
}