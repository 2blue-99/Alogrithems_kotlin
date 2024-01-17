package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune


/**
 * 2023-03-01
 * pureum
 */
val myArray = Array(91){-1L}

fun main(){
    println(fiBo(readln().toLong()).toBigInteger())
}

fun fiBo(gap:Long) : Long{
    if(gap == 0L) return  0
    else if(gap == 1L) return 1
    else if(myArray[gap.toInt()] != -1L) return myArray[gap.toInt()]
    val dap = fiBo(gap-1) + fiBo(gap-2)
    myArray[gap.toInt()] = dap
    return dap
}