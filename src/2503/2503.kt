package `2503`

//val list: MutableList<List<Int>> = mutableListOf()
//
//fun main() {
//    val N = readln().toInt()
//    repeat(N) {
//        list.add(readln().split(" ").map { it.toInt() })
//    }
//
//    var answer = 0
//
//    for (i in 1..<10) {
//        for (j in 1..<10) {
//            for (k in 1..<10) {
//                if (i == j || j == k || i == k) {
//                    continue
//                }
//
//                var count = 0
//                for (hint in list) {
//                    val number = hint[0]
//                    val strike = hint[1]
//                    val ball = hint[2]
//
//                    var ballCount = 0
//                    var strikeCount = 0
//
//                    val numberList = number.toString().toList().map { it.toString().toInt() }
//                    if (i == numberList[0]) {
//                        strikeCount += 1
//                    } else if (numberList.contains(i)) {
//                        ballCount += 1
//                    }
//
//                    if (j == numberList[1]) {
//                        strikeCount += 1
//                    } else if (numberList.contains(j)) {
//                        ballCount += 1
//                    }
//
//                    if (k == numberList[2]) {
//                        strikeCount += 1
//                    } else if (numberList.contains(k)) {
//                        ballCount += 1
//                    }
//
//                    if (ball == ballCount && strike == strikeCount) {
//                        count += 1
//                    }
//                }
//
//                if (count == N) {
//                    answer += 1
//                }
//            }
//        }
//    }
//    print(answer)
//}

/**
 * 재귀
 * */
fun main() {
    val N = readln().toInt()
    val list: MutableList<List<Int>> = mutableListOf()
    repeat(N) {
        list.add(readln().split(" ").map { it.toInt() })
    }
    println(recur(N, 100, 0, list))
}

fun recur(N: Int, targetNumber: Int, answer: Int, list: List<List<Int>>): Int {
    if (targetNumber == 1000) {
        return answer
    }
    val (a, b, c) = targetNumber.toString().toList().map { it.toString().toInt() }
    var count = 0
    if (targetNumber.toString().toSet().size == 3 && !targetNumber.toString().contains("0")) {
        for (hint in list) {
            val number = hint[0]
            val strike = hint[1]
            val ball = hint[2]

            var ballCount = 0
            var strikeCount = 0

            val numberList = number.toString().toList().map { it.toString().toInt() }
            if (a == numberList[0]) {
                strikeCount += 1
            } else if (numberList.contains(a)) {
                ballCount += 1
            }

            if (b == numberList[1]) {
                strikeCount += 1
            } else if (numberList.contains(b)) {
                ballCount += 1
            }

            if (c == numberList[2]) {
                strikeCount += 1
            } else if (numberList.contains(c)) {
                ballCount += 1
            }

            if (ball == ballCount && strike == strikeCount) {
                count += 1
            }
        }
    }
    return if (count == N) {
        recur(N, targetNumber + 1, answer + 1, list)
    } else {
        recur(N, targetNumber + 1, answer, list)
    }
}