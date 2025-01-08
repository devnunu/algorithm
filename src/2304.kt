fun main() {
    val N = readln().toInt()

    var maxIndex = 0
    val list = mutableListOf<List<Int>>()
    repeat(N) {
        val item = readln().split(" ").map { it.toInt() }
        maxIndex = Math.max(maxIndex, item[0])
        list.add(item)
    }

    val array = IntArray(maxIndex + 1)
    list.forEach { item ->
        array[item[0]] = item[1]
    }

    val maxValue = array.max()
    val maxValueIndex = array.indexOf(maxValue)

    val subResult1 = mutableListOf(0)
    for (i in 0..<maxValueIndex) {
        val result = Math.max(subResult1[i], array[i])
        subResult1.add(result)
    }

    val subResult2 = mutableListOf(0)
    for (i in array.size - 1 downTo maxValueIndex + 1) {
        val result = Math.max(subResult2[array.size - 1 - i], array[i])
        subResult2.add(result)
    }

    println((subResult1.sum() + subResult2.sum()) + maxValue)
}