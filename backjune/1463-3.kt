package com.blue.algorithem_kotlin.backjune

import kotlin.math.min

fun main(){
    val n = readln().toInt()
    val arr = IntArray(n+1)
    arr[1] = 0
    for(i in 2 .. n){
        arr[i] = arr[i-1] + 1
        if(i % 2 == 0) arr[i] = min(arr[i], arr[i/2] + 1)
        if(i % 3 == 0) arr[i] = min(arr[i], arr[i/3] + 1)
    }
    println(arr[n])
}

//fun main(){
//    val n = readln().toInt()
//    val arr = IntArray(n+1)
//    arr[1] = 0
//    for(i in 2 .. n){
//        arr[i] = arr[i-1]+1
//        arr[i] = min(arr[i],arr[i/3])+1
//        arr[i] = min(arr[i],arr[i/2])+1
//    }
//    println(arr.contentToString())
//    println(arr[n])
//}




// 피보나치
//fun main(){
//    val n = readln().toInt()
//    val fibo = LongArray(n+1)
//    fibo[0] = 1L
//    fibo[1] = 1L
//    for(i in 2..n){
//        fibo[i] = fibo[i-1] + fibo[i-2]
//    }
//    println(fibo[n])
//}





// DFS는 시간초과!!
//fun main(){
//    var max = 100001
//    fun dfs(n: Int, cnt: Int){
//        if(n == 1) {
//            if(max > cnt)
//                max = cnt
//            return
//        }
//
//        if(n%3==0) dfs(n/3, cnt+1)
//        if(n%2==0) dfs(n/2, cnt+1)
//        dfs(n-1, cnt+1)
//    }
//    dfs(readln().toInt(), 0)
//    println(max)
//}