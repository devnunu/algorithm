package `28353`

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }.sorted()

    var sp = 0
    var ep = N - 1
    var count = 0
    while (sp < ep) {
        val sum = list[sp] + list[ep]
        if (sum <= K) {
            count += 1
            sp += 1
            ep -= 1
        } else {
            ep -= 1
        }
    }
    println(count)
}