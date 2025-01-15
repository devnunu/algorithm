package `1932`

val list = mutableListOf<List<Int>>()
lateinit var dp: Array<Array<Int>>

fun main() {
    val N = readln().toInt()
    repeat(N) {
        val array = Array(N) { -1 }
        val inputList = readln().split(" ").map { it.toInt() }
        array.mapIndexed { index, i ->
            array[index] = inputList.getOrNull(index) ?: -1
        }
        list.add(array.toList())
    }

    dp = Array(N + 1) { Array(N + 1) { -1 } }

    println(recur(N, 0, 0))
}

fun recur(N: Int, x: Int, y: Int): Int {
    if (x == N - 1) {
        return list[x][y]
    }
    if (dp[x][y] != -1) {
        return dp[x][y]
    }
    dp[x][y] = Math.max(recur(N, x + 1, y), recur(N, x + 1, y + 1)) + list[x][y]
    return dp[x][y]
}

