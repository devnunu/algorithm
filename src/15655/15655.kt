package `15655`

val list: MutableList<Int> = mutableListOf()
val sb = StringBuilder()

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val compList = readln().split(" ").map { it.toInt() }.sorted()
    recur(N, M, compList)
    print(sb.toString())
}

fun recur(n: Int, m: Int, compList: List<Int>) {
    if (list.size == m) {
        list.forEachIndexed { index, i ->
            sb.append(i)
            if (index < list.size - 1) {
                sb.append(" ")
            }
        }
        sb.append("\n")
        return
    }
    for (i in 0..compList.size - 1) {
        if ((list.maxOrNull() ?: 0) < compList[i]) {
            list.add(compList[i])
            recur(n, m, compList)
            list.removeLast()
        }
    }
}