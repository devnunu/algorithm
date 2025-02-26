package `1271`

import java.math.BigInteger

fun main() {
    var A = BigInteger.ZERO
    var B = BigInteger.ZERO
    readln().split(" ").map { it.toBigInteger() }.also {
        A = it[0]
        B = it[1]
    }
    println(A / B)
    println(A % B)
}