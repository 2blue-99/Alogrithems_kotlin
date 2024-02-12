package com.blue.algorithem_kotlin.backjune

import androidx.recyclerview.widget.SortedList

fun main(){
    val n = readln().toInt()
    val arr = IntArray(n)

    repeat(n){
        val input = readln().toInt()
        arr[input] = input
    }

    arr.sort()


    var max = 0
    for(i in arr){
        var hap: Int
        val size = arr.size - i
        hap = arr[i]!! * size
        if(hap > max) max = hap
    }
    println(max)
}