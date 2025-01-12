package `2961`

//도영이는 짜파구리 요리사로 명성을 날렸었다. 이번에는 이전에 없었던 새로운 요리에 도전을 해보려고 한다.
//지금 도영이의 앞에는 재료가 N개 있다. 도영이는 각 재료의 신맛 S와 쓴맛 B를 알고 있다. 여러 재료를 이용해서 요리할 때, 그 음식의 신맛은 사용한 재료의 신맛의 곱이고, 쓴맛은 합이다.
//시거나 쓴 음식을 좋아하는 사람은 많지 않다. 도영이는 재료를 적절히 섞어서 요리의 신맛과 쓴맛의 차이를 작게 만들려고 한다. 또, 물을 요리라고 할 수는 없기 때문에, 재료는 적어도 하나 사용해야 한다.
//재료의 신맛과 쓴맛이 주어졌을 때, 신맛과 쓴맛의 차이가 가장 작은 요리를 만드는 프로그램을 작성하시오.


//첫째 줄에 재료의 개수 N(1 ≤ N ≤ 10)이 주어진다.
//다음 N개 줄에는 그 재료의 신맛과 쓴맛이 공백으로 구분되어 주어진다.
//모든 재료를 사용해서 요리를 만들었을 때, 그 요리의 신맛과 쓴맛은 모두 1,000,000,000보다 작은 양의 정수이다.
var min: Int = Int.MAX_VALUE
val list = mutableListOf<List<Int>>()

fun main() {
    val N = readln().toInt()

    val foodList = mutableListOf<List<Int>>()
    repeat(N) {
        //[ [1,2],[2,4]...[3,6]]
        // [신맛 S, 쓴맛 B]
        foodList.add(readln().split(" ").map { it.toInt() })
    }

    for (pickMax in 1..N) {
        recur(pickMax, 0, foodList)
    }

    println(min)
}

fun recur(pickMax: Int, startIndex: Int, foodList: List<List<Int>>) {
    if (list.size == pickMax) {
        val totalS = list.map { it[0] }.reduce { acc, num -> acc * num }
        val totalB = list.sumOf { it[1] }
        val result = Math.abs(totalS - totalB)
        min = min.coerceAtMost(result)
    }
    for (i in startIndex..<foodList.size) {
        list.add(foodList[i])
        recur(pickMax, i + 1, foodList)
        list.removeLast()
    }
}