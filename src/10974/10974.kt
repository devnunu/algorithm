package `10974`

val sb = StringBuilder()
val list = mutableListOf<Int>()

fun main() {
    val N = readln().toInt()

    recur(N, 0)
    println(sb.toString())
}

fun recur(N: Int, number: Int) {
    if (N == number) {
        if(list.toSet().size != N) return
        list.forEachIndexed { index, i ->
            sb.append(i)
            if (index < list.size - 1) {
                sb.append(" ")
            }
        }
        sb.append("\n")
        return
    }
    for (i in 1..N) {
        list.add(i)
        recur(N, number + 1)
        list.removeLast()
    }
}