package `19947`

var H = 0
var Y = 0
lateinit var dp: IntArray

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        H = it.get(0)
        Y = it.get(1)
    }
    dp = IntArray(Y + 1) { -1 }
    println(recur(0))
}

fun recur(year: Int): Int {
    if (year > Y) return -1
    if (year == Y) return H
    if (dp[year] != -1) return dp[year]

    var maxAmount = -1

    val year1 = recur(year + 1)
    if (year1 != -1) {
        maxAmount = maxOf(maxAmount, (year1 + (year1 * 5 / 100)))
    }

    val year3 = recur(year + 3)
    if (year3 != -1) {
        maxAmount = maxOf(maxAmount, (year3 + (year3 * 20 / 100)))
    }

    val year5 = recur(year + 5)
    if (year5 != -1) {
        maxAmount = maxOf(maxAmount, (year5 + (year5 * 35 / 100)))
    }
    dp[year] = maxAmount
    return maxAmount
}

//var H = 0
//var Y = 0

//fun main() {
//    readln().split(" ").map { it.toInt() }.also {
//        H = it.get(0)
//        Y = it.get(1)
//    }
//    println(recur(0, H))
//}
//
//fun recur(year: Int, total: Int): Int {
//    if (year == Y) {
//        return total
//    } else if (year > Y) {
//        return -1
//    }
//    val year1 = recur(year + 1, total + (total * 5 / 100))
//    val year3 = recur(year + 3, total + (total * 20 / 100))
//    val year5 = recur(year + 5, total + (total * 35 / 100))
//    return maxOf(maxOf(year1, year3), year5)
//}