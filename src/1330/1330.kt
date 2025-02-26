package `1330`

fun main() {
    var A = 0
    var B = 0
    readln().split(" ").map { it.toInt() }.also {
        A = it.get(0).toInt()
        B = it.get(1).toInt()
    }
    when {
        A > B -> println(">")
        A < B -> println("<")
        else -> println("==")
    }
}