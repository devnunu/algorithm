package `1543`

fun main() {
    val str = readln()
    val comp = readln()

    var count = 0
    var startIndex = 0

    while (startIndex <= str.length - comp.length) {
        val found = str.indexOf(comp, startIndex)
        if (found == -1) break

        count++
        startIndex = found + comp.length
    }

    println(count)
}