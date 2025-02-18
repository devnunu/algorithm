package `19947`

var H = 0
var Y = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        H = it.get(0)
        Y = it.get(1)
    }
    println(recur(0, H))
}

fun recur(year: Int, total: Int): Int {
    if (year == Y) {
        return total
    } else if (year > Y) {
        return -1
    }
    val year1 = recur(year + 1, total + (total * 5 / 100))
    val year3 = recur(year + 3, total + (total * 20 / 100))
    val year5 = recur(year + 5, total + (total * 35 / 100))
    return maxOf(maxOf(year1, year3), year5)
}