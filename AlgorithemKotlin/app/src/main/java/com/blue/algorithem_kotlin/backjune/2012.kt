package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune



/**
 * 2023-04-15
 * pureum
 */

/*
fun main(){
    val num = readln().toInt()
    val myArray = Array(num+1){0}
    val numArray = arrayListOf<Int>()
    repeat(num){
        val gap = readln().toInt()
        if(myArray[gap]==0) myArray[gap]+=1
        else numArray.add(gap)
    }
    numArray.sort()

    var dap = 0L
    for((index, i) in myArray.slice(1..num).withIndex()){
        if(i == 0) {
            dap += abs((index+1) - numArray.first())
            numArray.removeAt(0)
        }
    }
    println(dap)
}*/

import kotlin.math.abs

fun main(){
    val num = readln().toInt()
    val myArray = Array(num+1){0}
    val numArray = arrayListOf<Int>()
    repeat(num){
        val gap = readln().toInt()
        if(myArray[gap]==0) myArray[gap]+=1
        else numArray.add(gap)
    }
    numArray.sort()
    var dap = 0L
    for((index, i) in myArray.slice(1..num).withIndex()){
        if(i == 0) {
            dap += abs((index+1) - numArray.first())
            numArray.removeFirst()
        }
    }
    println(dap)
}