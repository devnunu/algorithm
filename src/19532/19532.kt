package `19532`

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val a = list.get(0)
    val b = list.get(1)
    val c = list.get(2)
    val d = list.get(3)
    val e = list.get(4)
    val f = list.get(5)

    val x = (f * b - e * c) / (b * d - a * e)
    val y = (a * f - d * c) / (a * e - b * d)

    println("$x $y")
}