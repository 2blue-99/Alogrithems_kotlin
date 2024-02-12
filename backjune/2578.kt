package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-11-29
 * pureum
 */
var checkCount = 0
var bgCount = 0
val bgArr = Array(5){IntArray(5)}
fun main(){

    for(i in 0..4){
        val list = readln().split(" ").map { it.toInt() }
        for((k, gap) in list.withIndex()){
            bgArr[i][k] = gap
        }
    }

    checkCount = 0

    loop@ for(i in 0 until 5){
        val list = readln().split(" ").map { it.toInt() }
        for (num in list){
            checkCount += 1
            bgCount = 0
            checkBg(num)
            if(bgCount > 2) break@loop
        }
    }
    print(checkCount)
}
fun checkBg(num: Int){
    var count:Int
    for(i in 0 until 5){
        count=0
        for( k in 0 until 5) {
            if (bgArr[k][i] == num) bgArr[k][i] = 0
            if (bgArr[k][i] == 0) count++
        }
        if(count==5) bgCount++
    }

    for(i in 0 until 5){
        count=0
        for( k in bgArr[i])
            if (k == 0) count++
        if(count==5) bgCount++
    }

    count = 0
    var width = 0
    for(i in 0 until 5){
        if(bgArr[i][width] == 0) count++
        width += 1
    }
    if(count==5) bgCount++

    width = 0
    count = 0
    for(i in 4 downTo  0){
        if(bgArr[i][width] == 0) count++
        width += 1
    }
    if(count==5) bgCount++
}