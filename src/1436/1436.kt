package `1436`

fun main() {
    val N = readln().toInt()
    var count = 0
    var result = 0L
    for (i in 666..Long.MAX_VALUE) {
        if (i.toString().contains("666")) {
            count += 1
        }
        if (count == N) {
            result = i
            break
        }
    }
    println(result)
}