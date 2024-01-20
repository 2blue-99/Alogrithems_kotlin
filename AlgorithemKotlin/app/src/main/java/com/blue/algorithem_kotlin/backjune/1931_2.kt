package com.blue.algorithem_kotlin.backjune

import kotlin.math.max

fun main() {
    // 회의실에서 최대한 많은 회의가 진행되어야 하는 문제임.
    // 풀이
    // 1. 경우의 수 중에서, 현재 최적의 방법을 선택하는 방식으로 계산하며 풀이
    // 2. 1번에서 DP를 추가하여 시간복잡도를 개선하는 풀이

    // 3번
    // 정렬 + dp
    val n = readln().toInt()
    val arr = Array<List<Int>>(n){ listOf() }
    var cnt = 0

    repeat(n){ arr[it] = readln().split(" ").map { it.toInt() } }

    arr.sortWith(compareBy({it.last()}, {it.first()}))

    var now = 0
    for(i in arr.indices){
        if(now <= arr[i].first()){
            now = arr[i].last()
            cnt++
        }
    }

    println(cnt)
}

// 1번
// DFS로 모든 경우의 수 구해보기 ----> 실패
//val n = readln().toInt()
//val arr = Array<List<Int>>(n){ listOf() }
//var vArr = BooleanArray(n)
//repeat(n){
//    arr[it] = readln().split(" ").map { it.toInt() }
//}
//
//fun dfs(end: Int): Int{
//    var max = 0
//    for(i in arr.indices){
//        if(vArr[i]) continue
//        if(end > arr[i].first()) continue
//        vArr[i] = true
//        val result = dfs(arr[i].last()) + 1
//        if(max<result) max = result
//    }
//    return max
//}
//println(dfs(0))


// 2번
// DFS로 모든 경우의 수 + DP ----> 실패
//val n = readln().toInt()
//val arr = Array<List<Int>>(n){ listOf() }
//val vArr = BooleanArray(n)
//val dp = IntArray(n){-1}
//
//repeat(n){ arr[it] = readln().split(" ").map { it.toInt() } }
//
//fun dfs(end: Int): Int{
//    var max = 0
//    for(i in arr.indices){
//        if(vArr[i]) continue
//        if(end > arr[i].first()) continue
//        vArr[i] = true
//        if(dp[i]== -1) {
//            val result = dfs(arr[i].last()) + 1
//            dp[i] = result
//            if(max < result){
//                max = result
//                dp[i] = result
//            }
//        }else{
//            max = dp[i]
//        }
//    }
//    return max
//}
//dfs(0)
//println(dp.max())