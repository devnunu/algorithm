package `1904`

var N = 0
lateinit var list: Array<Int>

fun main() {
    N = readln().toInt()

    if (N < 2) {
        println(N)
        return
    }

    list = Array(N) { 0 }

    list[0] = 1
    list[1] = 2

    for (i in 2..<N) {
        list[i] = (list[i - 1] + list[i - 2]) % 15746
    }

    println(list[N - 1])
}
