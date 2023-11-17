package com.example.alogrithems.backjune

/**
 * 2023-09-19
 * pureum
 */

fun main(){
    val input = readln().toInt()
    val myArray = Array(1001){0}
    for(i in 1..input){
        when(i){
            1-> myArray[i] = 1
            2-> myArray[i] = 2
            else -> myArray[i] = (myArray[i-1] + myArray[i-2]) % 10007
        }
    }
    println(myArray[input])
}