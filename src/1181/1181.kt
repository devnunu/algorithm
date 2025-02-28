package `1181`

fun main() {
    val N = readln().toInt()
    val list = mutableListOf<String>()
    repeat(N) {
        list.add(readln())
    }

    val sortedList = list.toSet().toMutableList().sortedWith(compareBy<String> { it.length }.thenBy { it })
    sortedList.forEach { println(it) }
}