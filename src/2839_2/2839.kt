package `2839_2`

var N = 0
lateinit var dp: Array<Int>

fun main() {
    N = readln().toInt()
    val result = recur(N)
    if (result < 0) {
        println(-1)
    } else {
        println(recur(N))
    }
}

fun recur(remain: Int): Int {
    if (remain == 0) {
        return 0
    } else if (remain < 0) {
        return Int.MIN_VALUE
    }
    return if (remain % 5 == 0) {
        recur(remain - 5) + 1
    } else {
        recur(remain - 3) + 1
    }
}