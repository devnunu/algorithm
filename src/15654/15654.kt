package `15654`

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val compList = readln().split(" ").map { it.toInt() }.sorted()
    recur(N, M, compList)
}

fun recur(N: Int, M: Int, compList: List<Int>, list: List<Int> = emptyList()) {
    if (list.size == M) {
        println(list.joinToString(" "))
        return
    }
    for (i in 0..<compList.size) {
        if(!list.contains(compList[i])) {
            recur(N, M, compList, list + compList[i])
        }
    }
}