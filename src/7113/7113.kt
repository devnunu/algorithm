package `7113`

var X = 0
var Y = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        X = it[0]
        Y = it[1]
    }

    print(recur(X, Y, 1))
}

fun recur(x: Int, y: Int, count: Int): Int {
    return if (x < y) {
        if (y - x <= 0) {
            return count
        } else {
            recur(x, y - x, count + 1)
        }
    } else {
        if (x - y <= 0) {
            return count
        } else {
            recur(x - y, y, count + 1)
        }
    }
}