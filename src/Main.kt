val N = readLine()!!.toInt()

fun main() {
    val positionList: MutableList<List<Int>> = mutableListOf()
    repeat(N) {
        positionList.add(readLine()!!.split(" ")!!.map { it.toInt() })
    }

    for (i in 0..N - 1) {
        var count = 0
        repeat(i) {

        }
    }
    // 0~3
    // 1~3
    // 2~3
    // 3~3


    println(positionList)
}