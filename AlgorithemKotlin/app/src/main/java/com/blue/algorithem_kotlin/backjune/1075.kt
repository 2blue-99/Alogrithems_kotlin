package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-19
 * pureum
 */

fun main(){
    val n = readln().toInt()
    val f = readln().toInt()
    val back = n % 100
    val minN = n - back
    val maxN = minN + 100

    var answer = ""
    for(i in minN until maxN){
        if(i%f==0){
            answer = i.toString()
            break
        }
    }
    println("${answer[answer.length-2]}${answer.last()}")
}