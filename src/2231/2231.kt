package `2231`

fun main() {
    val N = readln().toInt()

    var result = 0
    for (i in 1..N) {
        val list = i.toString().map { it.toString().toInt() }.toList()
        val sum = i + list.sum()
        if (sum == N) {
            result = i
            break
        }
    }
    println(result)
}