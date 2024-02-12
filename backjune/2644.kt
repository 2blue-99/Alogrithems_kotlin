package com.blue.algorithem_kotlin.backjune


//fun main() {
//    // 부모 자식 관계를 입력 받아 주어진 두 사람의 촌수를 계산하는 문제
//    val n = readln().toInt()
//    val arr = Array(n + 1) { mutableListOf<Int>() }
//    val vArr = BooleanArray(n+1)
//    val want = readln().split(" ").map { it.toInt() }
//    val queue = ArrayDeque<List<Int>>()
//    var result = -1
//
//    repeat(readln().toInt()) {
//        val (a, b) = readln().split(" ").map { it.toInt() }
//        arr[a].add(b)
//        arr[b].add(a)
//    }
//
//    queue.addLast(listOf(want[0], 0))
//
//    loop@ while (queue.isNotEmpty()){
//        val (target,cnt) = queue.removeFirst()
//        if(vArr[target]) continue
//        vArr[target] = true
//        for( i in arr[target] ){
//            if(i == want[1]) {
//                result = cnt+1
//                break@loop
//            }
//            queue.addLast(listOf(i, cnt+1))
//        }
//    }
//    println(result)
//}

fun main() {
    // 부모 자식 관계를 입력 받아 주어진 두 사람의 촌수를 계산하는 문제

    val n = readln().toInt()
    val arr = Array(n + 1) { mutableListOf<Int>() }
    val vArr = BooleanArray(n+1)
    val want = readln().split(" ").map { it.toInt() }
    var result = -1

    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        arr[a].add(b)
        arr[b].add(a)
    }

    fun dfs(a: Int, cnt: Int) {
        if(vArr[a]) return
        if (a == want[1]){
            result = cnt
            return
        }
        for ((index,i) in arr[a].withIndex()) {
            if(i != -1) {
                arr[a][index] = -1
                vArr[a] = true
                dfs(i, cnt+1)
            }
        }
    }
    dfs(want[0], 0)
    println(result)
}