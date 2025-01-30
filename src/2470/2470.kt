package `2470`

import kotlin.math.abs

fun main() {
    val N = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.sorted()

    var sp = 0
    var ep = N - 1
    var min = abs(list[sp] + list[ep])
    var pair: Pair<Int, Int> = 0 to 0
    while (sp < ep) {
        val sum = list[sp] + list[ep]
        if (abs(sum) <= min) {
            min = abs(sum)
            pair = list[sp] to list[ep]
        }
        if (sum < 0) {
            sp += 1
        } else {
            ep -= 1
        }
    }

    println(pair.toList().sorted().joinToString(" "))
}