package com.example.alogrithems.backjune


/**
 * 2023-03-01
 * pureum
 */

fun main(){
    val num = readln().toInt()
    val storeArray = Array(1050){ arrayListOf(0)}
    val maxArray = Array(num+1){0}
    val day = Array(num+1){0}
    val money = Array(num+1){0}

    for(i in 1..num){
        val (a,b) = readln().split(" ").map { it.toInt() }
        day[i] = a
        money[i] = b
    }
    for(i in 1..num){
        if(day[i]+i-1 > num) continue
        maxArray[i] += storeArray[i].max() + money[i]
        for(k in i..num)
            storeArray[ day[i] + k ].add(maxArray[i])
    }
    println(maxArray.max())
}