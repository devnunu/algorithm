package `11382`

import java.math.BigInteger

fun main() {
    var A = BigInteger.ZERO
    var B = BigInteger.ZERO
    var C = BigInteger.ZERO
    readln().split(" ").map { it.toBigInteger() }.also {
        A = it[0]
        B = it[1]
        C = it[2]
    }

    println(A + B + C)
}