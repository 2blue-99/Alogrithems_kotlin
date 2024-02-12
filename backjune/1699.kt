package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import kotlin.math.min


/**
 * 2023-03-23
 * pureum
 */

fun main(){
    val gap = readln().toInt()
    val myArray = Array(100001){0}
    for(i in 1..gap) myArray[i] = i
    for(i in 2..gap){
        var j = 2
        while (j*j<=i){
            myArray[i] = min(myArray[i], myArray[i - j * j] + 1)
            j++
        }

    }
    println(myArray[gap])
}