package `14606`

var N = 0
fun main() {
    N = readln().toInt()
    println(recur(0, 0))
}

fun recur(idx: Int, sum: Int): Int {
    if (idx == N) {
        return sum
    }
    return recur(idx + 1, sum + idx)
}