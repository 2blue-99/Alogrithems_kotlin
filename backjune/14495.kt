package com.example.alogrithems.backjune

import java.math.BigInteger

/**
 * 2023-03-07
 * pureum
 */

val myList = Array(117){ _ ->BigInteger("0")}

fun main(){
    val gap = readln().toInt()
    println(calculate(gap))
}

fun calculate(gap:Int):BigInteger{
    if(gap==1 || gap==2 || gap==3) return BigInteger("1")
    if(myList[gap] != BigInteger("0")) return myList[gap]
    val input = calculate(gap-3) + calculate(gap-1)
    myList[gap] = input
    return input
}