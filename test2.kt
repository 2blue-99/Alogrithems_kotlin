package com.example.alogrithems

import kotlin.math.max

/**
 * 2023-07-25
 * pureum
 */

fun main(){
    val count = readln().toInt()
    val numArray = Array(count+1){-1}
    val hapArray = Array(count+1){-1}
    repeat(count){
        numArray[it+1] = readln().toInt()
    }
    for(i in 1..count){
        when(i){
            1 -> hapArray[i] = numArray[i]
            2 -> hapArray[i] = numArray[i] + hapArray[i-1]
            else -> {
                hapArray[i] = max(numArray[i] + numArray[i-1] + hapArray[i-3], numArray[i] + hapArray[i-2])
            }
        }
    }
    println(hapArray[count])
}
