package `19942`

val list = mutableListOf<List<Int>>()
var N: Int = 0
val standardList = mutableListOf<Int>()

var minCash = Int.MAX_VALUE
val resultIndexList = mutableListOf<Int>()

fun main() {
    N = readln().toInt()
    standardList.addAll(readln().split(" ").map { it.toInt() })
    repeat(N) {
        list.add(readln().split(" ").map { it.toInt() })
    }

    recur(0, 0, 0, 0, 0, 0, listOf(), 0)
    if (resultIndexList.size == 0) {
        println(-1)
    } else {
        println(minCash)
        resultIndexList.sort()
        println(resultIndexList.joinToString(" "))
    }

}

fun recur(index: Int, p: Int, f: Int, s: Int, v: Int, c: Int, indexList: List<Int>, use: Int) {
    if (index == N) {
        if (use == 0) {
            return
        }
        if (p < standardList[0] || f < standardList[1] || s < standardList[2] || v < standardList[3]) {
            return
        }
        if (minCash > c) {
            minCash = c
            resultIndexList.clear()
            resultIndexList.addAll(indexList)
        }
        return
    }

    if (!list[index].all { it == 0 }) {
        recur(
            index + 1,
            p + list[index][0],
            f + list[index][1],
            s + list[index][2],
            v + list[index][3],
            c + list[index][4],
            indexList + (index + 1),
            use + 1
        )
    }
    recur(index + 1, p, f, s, v, c, indexList, use)

}