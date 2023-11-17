package com.example.alogrithems.backjune

import kotlin.math.min

/**
 * 2023-03-06
 * pureum
 */

var count = 0

fun main(){
    var num = readln().toInt()
    val myArray = IntArray(num+1)
    for(i in 2..num){
        myArray[i] = myArray[i-1]+1
        if(i%2==0) myArray[i] = min(myArray[i], myArray[i/2]+1)
        if(i%3==0) myArray[i] = min(myArray[i], myArray[i/3]+1)
    }
    println(myArray[num])
}



