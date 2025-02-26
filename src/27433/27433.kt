package `27433`

fun main() {
    val N = readln().toLong()

    var result = 1L
    for (num in 1..N) {
        result = result * num
    }
    println(result)
}