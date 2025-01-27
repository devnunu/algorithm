package `2018`

fun main() {
    val N = readln().toInt()

    var sp = 1
    var ep = 1
    var count = 1
    var sum = 1
    while (ep != N) {
        if (sum == N) {
            count += 1
            ep += 1
            sum += ep
        } else if (sum < N) {
            ep += 1
            sum += ep
        } else {
            sum -= sp
            sp += 1
        }
    }
    println(count)
}