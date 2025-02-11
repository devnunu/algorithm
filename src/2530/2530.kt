package `2530`

fun main() {
    val (A, B, C) = readln().split(" ").map { it.toInt() }
    val D = readln().toInt()

    val time = (D + (A * 3600 + B * 60 + C)) % (3600 * 24)

    val hour = time / 3600
    val min = time % 3600 / 60
    val sec = time % 3600 % 60

    println("$hour $min $sec")
}