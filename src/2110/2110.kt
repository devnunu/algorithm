package `2110`

fun main() {
    val (N, C) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    repeat(N) {
        list.add(readln().toInt())
    }

    val sortedList = list.sorted()

    var sp = 0
    var ep = N - 1
    var install = 1
    var max = 0
    while (install < C || sp <= ep) {
        val mIdx = (sp + ep) / 2
        val distance = (sortedList[ep] - sortedList[sp])
        max = distance
        println("sp:${sp}, ep:${ep}, distance:${distance}")
        val leftSide = sortedList[sp] - sortedList[mIdx - 1]
        val rightSide = sortedList[mIdx + 1] - sortedList[ep]
        if (leftSide > rightSide) {
            ep = mIdx - 1
        } else {
            sp = mIdx + 1
        }
        install += 1
    }

    println(max)
}