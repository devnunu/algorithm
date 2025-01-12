package `14501`

val list = mutableListOf<List<Int>>()
var maxTotalAmount = 0
fun main() {
    val N = readln().toInt()
    repeat(N) {
        list.add(readln().split(" ").map { it.toInt() })
    }
    recur(N, 0, 0, 0)
    println(maxTotalAmount)
}

fun recur(N: Int, idx: Int, coolTime: Int, totalAmount: Int) {
    if (N == idx) {
        maxTotalAmount = Math.max(maxTotalAmount, totalAmount)
        return
    }
    // 선택할 때
    if (coolTime <= 0) {
        val timeOver = list[idx][0] + idx > N
        if (!timeOver)
            recur(N, idx + 1, list[idx][0] - 1, totalAmount + list[idx][1])
    }
    // 선택 안 할 때
    recur(N, idx + 1, coolTime - 1, totalAmount)
}