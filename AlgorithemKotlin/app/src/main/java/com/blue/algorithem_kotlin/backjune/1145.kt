package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2022-10-04
 * pureum
 */

fun main(){
    var count=0
    var num = 1
    val numList = readLine()?.split(" ")?.map { it.toInt() }
    while(count < 3) {
        count = 0
        num++
        for (i in numList!!) {
            if (num % i == 0) {
                count++
            }
        }
    }
    print("$num")
}