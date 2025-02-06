package `18511`

var N = 0
var K = 0
lateinit var list: List<Int>

var max = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it[0]
        K = it[1]
    }
    list = readln().split(" ").map { it.toInt() }

    recur(0, "0")
    print(max)
}

fun recur(idx: Int, num: String): Int {
    if (num.toInt() > N) {
        return 0
    }
    if (idx == N.toString().length) {
        return num.toInt()
    }
    for (i in list) {
        val result = maxOf(
            // 선택한 경우
            recur(idx + 1, num + i.toString()),
            // 선택하지 않은 경우
            recur(idx + 1, num)
        )
        max = maxOf(result, max)
    }
    return max
}