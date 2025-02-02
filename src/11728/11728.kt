package `11728`

fun main() {
    // 입력
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toLong() }
    val b = readln().split(" ").map { it.toLong() }

    // 투 포인터로 병합
    var i = 0 // a 배열 포인터
    var j = 0 // b 배열 포인터
    val result = mutableListOf<Long>()

    while (i < n && j < m) {
        if (a[i] <= b[j]) {
            result.add(a[i])
            i++
        } else {
            result.add(b[j])
            j++
        }
    }

    // 남은 요소 처리
    while (i < n) result.add(a[i++])
    while (j < m) result.add(b[j++])

    println(result.joinToString(" "))
}