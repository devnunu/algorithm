package `17478`

var N = 0
val list = listOf(
    "\"재귀함수가 뭔가요?\"",
    "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
    "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
    "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
)

fun main() {
    N = readln().toInt()

    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    recur(0)
}

fun recur(count: Int) {
    if (count == N) {
        printPrefix(count)
        println("\"재귀함수가 뭔가요?\"")
        printPrefix(count)
        println("\"재귀함수는 자기 자신을 호출하는 함수라네\"")
        printPrefix(count)
        println("라고 답변하였지.")
        return
    }

    list.forEach {
        printPrefix(count)
        println(it)
    }
    recur(count + 1)
    printPrefix(count)
    println("라고 답변하였지.")
}

fun printPrefix(count: Int) {
    repeat(count) {
        print("____")
    }
}