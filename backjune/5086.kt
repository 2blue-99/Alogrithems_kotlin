package com.example.alogrithems.backjune

/**
 * 2023-02-21
 * pureum
 */

fun main(){
    while(true){
        val (a,b) = readln().split(" ").map { it.toDouble() }
        if(a==0.0 && b==0.0) break
        if((b%a).toInt() == 0) println("factor")
        else if((a%b).toInt() == 0) println("multiple")
        else println("neither")
    }
}