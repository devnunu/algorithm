package `2559`

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }

    var sp = 0
    var ep = K - 1
    var max = 0
    for (i in sp..ep) {
        max += list[i]
    }

    var sum = max
    while (ep < list.size - 1) {
        sum -= list[sp]
        sp += 1
        ep += 1
        sum += list[ep]
        if (max < sum) {
            max = sum
        }
    }
    println(max)
}