package `1940`

fun main() {
    val N = readln().toInt()
    val M = readln().toInt()

    val list = readln().split(" ").map { it.toInt() }.sorted()

    var sp = 0
    var ep = N - 1
    var count = 0

    while (sp < ep) {
        val result = list[sp] + list[ep]
        if (result == M) {
            count += 1
            sp += 1
            ep -= 1
        } else if (result < M) {
            sp += 1
        } else {
            ep -= 1
        }
    }

    println(count)
}