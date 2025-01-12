package `12865`

val list = mutableListOf<List<Int>>()

var maxWeight = 0
var maxValue = 0

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    maxWeight = K
    repeat(N) {
        list.add(readln().split(" ").map { it.toInt() })
    }
    recur(N, 0, 0, 0)
    print(maxValue)
}

fun recur(N: Int, index: Int, totalWeight: Int, totalValue: Int) {
    if (index == N) {
        if (totalWeight <= maxWeight) {
            maxValue = Math.max(maxValue, totalValue)
        }
        return
    }

    recur(N, index + 1, totalWeight + list[index][0], totalValue + list[index][1])
    recur(N, index + 1, totalWeight, totalValue)
}