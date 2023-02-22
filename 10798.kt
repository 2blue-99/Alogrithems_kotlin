package com.example.alogrithems

/**
 * 2023-02-22
 * pureum
 */

fun main(){
    val myArray = Array(5) { Array(15) { "none" } }
    for( i in 0 until 5) {
        val gap = readln().chunked(1)
        for( (index,k) in gap.withIndex()){ myArray[i][index] = k }
    }
    for(i in 0 until 15){
        for(k in 0 until 5){
            if(myArray[k][i] == "none") continue
            print(myArray[k][i])
        }
    }
}