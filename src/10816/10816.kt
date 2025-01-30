package `10816`

fun main() {
    val N = readln().toInt()
    val listN = readln().split(" ").map { it.toInt() }.sorted()
    val M = readln().toInt()
    val listM = readln().split(" ").map { it.toInt() }

    val resultList = mutableListOf<Int>()
    listM.forEach { i ->
        var sp = 0
        var ep = listN.size - 1
        var firstIndex = -1
        var lastIndex = -1
        while (sp <= ep) {
            val midx = (sp + ep) / 2
            if (listN[midx] == i) {
                firstIndex = midx
                ep = midx - 1
            } else if (listN[midx] > i) {
                ep = midx - 1
            } else {
                sp = midx + 1
            }
        }
        sp = 0
        ep = listN.size - 1
        while (sp <= ep) {
            val midx = (sp + ep) / 2
            if (listN[midx] == i) {
                lastIndex = midx
                sp = midx + 1
            } else if (listN[midx] > i) {
                ep = midx - 1
            } else {
                sp = midx + 1
            }
        }
        if (firstIndex == -1 && lastIndex == -1) {
            resultList.add(0)
        } else if ((firstIndex == -1 || lastIndex == -1)) {
            resultList.add(1)
        } else {
            resultList.add(lastIndex - firstIndex + 1)
        }
    }
    println(resultList.joinToString(" "))
}