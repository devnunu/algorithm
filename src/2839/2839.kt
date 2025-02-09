package `2839`

var N = 0

fun main() {
    N = readln().toInt()

    var div5Count = 0
    var minus3Count = 0
    if (N < 3 || N == 4 || N == 7) {
        println(-1)
    } else {
        while (N > 0) {
            if (N % 5 == 0) {
                div5Count = N / 5;
                break
            } else {
                N = N - 3;
                minus3Count++
            }
        }
        println(div5Count + minus3Count)
    }
}