package `15651`

val list = mutableListOf<Int>()
val sb = StringBuilder()

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    recur(N, M)
    print(sb.toString())
}

fun recur(N: Int, M: Int) {
    if (list.size == M) {
        list.forEachIndexed { index, num ->
            sb.append(num)
            if (index < list.size - 1) {
                sb.append(" ")
            }
        }
        sb.append("\n")
        return
    }
    for (i in 1..N) {
        list.add(i)
        recur(N, M)
        list.removeLast()
    }
}