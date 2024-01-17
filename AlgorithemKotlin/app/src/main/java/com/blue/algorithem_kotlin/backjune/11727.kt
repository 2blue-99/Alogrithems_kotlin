package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-09-25
 * pureum
 */

fun main(){
    val myA = Array(1001){0}
    myA[1] = 1
    myA[2] = 3
    val num = readln().toInt()
    for(i in 3..num)
        myA[i] = (myA[i-1] + (myA[i-2]*2)) % 10007
    println(myA[num])
}