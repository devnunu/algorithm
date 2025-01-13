package `6603`

val sb = StringBuilder()

fun main() {
    while (true) {
        val raw = readln().split(" ").map { it.toInt() }
        val size = raw[0]
        if (size == 0) break
        val list = raw.subList(1, size + 1)
        recur(list, emptyList(), 0)
    }
}

fun recur(sequence: List<Int>, arr: List<Int>, start: Int) {
    if (arr.size == 6) {
        println(arr)
        arr.forEachIndexed { index, i ->
            sb.append(i)
            if (index < arr.size - 1) {
                sb.append(" ")
            }
        }
        sb.append("\n")
        return
    }
    for (i in start..<sequence.size) {
        recur(sequence, arr + sequence[i], i + 1)
    }
}
