package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    val arr = BooleanArray(100001)
    val bf = StringBuffer()
    readln().split(" ").forEach{
        arr[it.toInt()] = true
    }

    val m = readln().toInt()
    readln().split(" ").forEach{
        if(arr[it.toInt()]){
            bf.append("1\n")
        }
        else
            bf.append("0\n")
    }
    println(bf)
}