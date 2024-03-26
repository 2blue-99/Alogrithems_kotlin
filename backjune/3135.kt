package com.blue.algorithem_kotlin.backjune

fun main() {
    val (a,b) = readln().split(" ").map{it.toInt()}
    val n = readln().toInt()
    val arr = IntArray(n+1)
    val result = mutableListOf<Int>()

    arr[0] = a

    repeat(n){
        arr[it+1] = readln().toInt()
    }

    for(i in 0..n){
        var now = arr[i]
        var cnt = if(now==a) 0 else 1
        if(i != 0 && now == b){
            result.add(1)
            break
        }
        while(now != b){
            if(now<=b)
                now+=1
            else
                now-=1
            cnt++
        }
        result.add(cnt)
    }
    println(result.min())
}