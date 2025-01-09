package `11659`

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }

    val calcList = mutableListOf<List<Int>>()
    repeat(M) {
        calcList.add(readln().split(" ").map { it.toInt() })
    }

    val prefixList = IntArray(list.size + 1)
    for (i in 0..<list.size) {
        prefixList[i + 1] = prefixList[i] + list[i]
    }

    calcList.forEach { calc ->
        val firstIndex = calc[0]
        val lastIndex = calc[1]
        val result = prefixList[lastIndex] - prefixList[firstIndex - 1]
        println(result)
    }
}