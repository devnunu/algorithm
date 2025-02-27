package `2751`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()
    val list = ArrayList<Int>(N) // 크기를 미리 지정하여 메모리 재할당 방지

    for (i in 0 until N) {
        list.add(br.readLine().toInt())
    }

    list.sort() // 기본 정렬 사용

    for (num in list) {
        bw.write("$num\n")
    }

    bw.flush()
    bw.close()
    br.close()
}