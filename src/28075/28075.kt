package `28075`

var N = 0
var M = 0
val plan = mutableListOf<Int>()
var result = 0

fun main() {
    readln().split(" ").map { it.toInt() }.also {
        N = it[0]
        M = it[1]
    }

    plan.addAll(readln().split(" ").map { it.toInt() })
    plan.addAll(readln().split(" ").map { it.toInt() })
    recur(1, -1, 0)
    println(result)
}

fun recur(days: Int, prevIdx: Int, sum: Int) {
    if (days > N) {
        if (sum >= M) result += 1
        return
    }
    for (i in 0..<plan.size) {
        val postSum = if (i == prevIdx || i == prevIdx + 3 || i == prevIdx - 3) {
            sum + (plan[i] / 2)
        } else {
            sum + plan[i]
        }
        recur(days = days + 1, prevIdx = i, sum = postSum)
    }
}