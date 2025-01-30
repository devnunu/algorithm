package `1920`

fun main() {
    val N = readln().toInt()
    val listN = readln().split(" ").map { it.toInt() }.sorted()
    val M = readln().toInt()
    val listM = readln().split(" ").map { it.toInt() }

    listM.forEach { i ->
        var sp = 0
        var ep = listN.size - 1
        var flag = false
        while (sp <= ep) {
            val midx = (sp + ep) / 2
            if (listN[midx] == i) {
                flag = true
                break
            } else if (listN[midx] > i) {
                ep = midx - 1
            } else {
                sp = midx + 1
            }
        }
        if (flag) {
            println(1)
        } else {
            println(0)
        }
    }
}