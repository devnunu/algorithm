package `6221`

fun main() {
    val N = readln().toInt()
    val array: Array<Array<Int>> = Array(N) { arrayOf() }

    for (i in 0..<N) {
        array[i] = readln().split(" ").map { it.toInt() }.toTypedArray()
    }

    array.sortBy { it[0] }
    val list = array.map { it[1] }
    val dp = Array(list.size) { 1 }

    for (i in 0..<N) {
        for (j in 0..<i) {
            if (list[j] < list[i]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }
    println(dp.max())
}