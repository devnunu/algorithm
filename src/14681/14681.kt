package `14681`

fun main() {
    val X = readln().toInt()
    val Y = readln().toInt()


    when {
        X > 0 && Y > 0 -> println("1")
        X < 0 && Y > 0 -> println("2")
        X < 0 && Y < 0 -> println("3")
        else -> println("4")
    }
}