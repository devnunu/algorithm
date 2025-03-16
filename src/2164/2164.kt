package `2164`

fun main() {
    val n = readln().toInt()

    val queue = ArrayDeque<Int>()
    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.removeFirst()
        queue.add(queue.removeFirst())
    }

    println(queue.first())
}