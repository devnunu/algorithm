package `15501`

var count = 0

fun main() {
    val N = readln().toInt()
    repeat(N) {
        val str = readln().split("")
        count = 0
        val result = recur(str, 0, str.size - 1)
        println("$result $count")

    }
}

fun recur(str: List<String>, s: Int, e: Int): Int {
    return if (s >= e) 1
    else if (str[s] != str[e]) 0
    else {
        count += 1
        recur(str, s + 1, e - 1)
    }
}
