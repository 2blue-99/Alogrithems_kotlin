package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-10-05
 * pureum
 */

fun main() {
    val myArr = Array(1_000_001) { 0L }
    myArr[1] = 1
    myArr[2] = 2
    myArr[3] = 4

    val numList = mutableListOf<Int>()
    repeat(readln().toInt()) {
        numList.add(readln().toInt())
    }

    for (i in 4..numList.max()) {
        myArr[i] = (myArr[i - 1] + myArr[i - 2] + myArr[i - 3]) % 1_000_000_009
    }

    numList.forEach{println(myArr[it])}
}