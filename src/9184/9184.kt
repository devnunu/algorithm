package `9184`

lateinit var dp: Array<Array<Array<Long>>>

fun main() {
    while (true) {
        val list = readln().split(" ").map { it.toInt() }
        if (list.all { it == -1 }) break
        else if (list.any { it < 0 }) {
            println("w(${list[0]}, ${list[1]}, ${list[2]}) = 1")
            continue
        }

        dp =
            Array(21) {
                Array(21) {
                    Array(21) {
                        0L
                    }
                }
            }

        val result = w(list[0], list[1], list[2])
        println("w(${list[0]}, ${list[1]}, ${list[2]}) = $result")
    }
}

fun w(a: Int, b: Int, c: Int): Long {
    if (a <= 0 || b <= 0 || c <= 0) {
        return 1
    }
    if (a > 20 || b > 20 || c > 20) {
        return w(20, 20, 20)
    }
    if (dp[a][b][c] != 0L) {
        return dp[a][b][c]
    }
    return if (a < b && b < c) {
        dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        dp[a][b][c]
    } else {
        dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
        dp[a][b][c]
    }
}