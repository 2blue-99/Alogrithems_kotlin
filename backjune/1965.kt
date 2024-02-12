package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import kotlin.math.max

/**
 * 2023-09-27
 * pureum
 */

fun main(){
    val num = readln().toInt()
    val numList = readln().split(" ").map { it.toInt() }
    val numArr = Array(num){0}
    val dapArr = Array(num){0}
    var max = 0
    repeat(num){
        numArr[it] = numList[it]
    }

    for(i in (num-1) downTo 0){
        for(k in i+1 until num){
            if(numArr[i] < numArr[k]) {
                if(dapArr[k] > max)
                    max = dapArr[k]
                break
            }
        }
        dapArr[i] = max + 1
        max = 0
    }
    println(dapArr.max())
}