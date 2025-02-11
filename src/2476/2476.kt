package `2476`

fun main() {
    val N = readln().toInt()
    var max = 0
    repeat(N) {
        val (A, B, C) = readln().split(" ").map { it.toInt() }
        val bounty = when {
            // 세 개가 모두 같은 경우
            A == B && B == C -> 10000 + (A * 1000)
            // 두 개가 같은 경우
            A == B -> 1000 + (A * 100)
            B == C -> 1000 + (B * 100)
            A == C -> 1000 + (A * 100)
            // 모두 다른 경우
            else -> maxOf(A, B, C) * 100
        }
        max = maxOf(max, bounty)
    }
    println(max)
}