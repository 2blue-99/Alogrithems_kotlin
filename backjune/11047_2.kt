package com.blue.algorithem_kotlin.backjune


fun main(){
    var (n, k) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n){0}
    var temp = 0
    var cnt = 0
    repeat(n){
        arr[n-it-1] = readln().toInt()
    }
    for(i in arr.indices){
        cnt += k / arr[i]
        k %= arr[i]
        if(k == 0) break
    }
    println(cnt)
}
