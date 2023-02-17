package com.example.alogrithems

/**
 * 2023-02-17
 * pureum
 */

fun main(){
    val num = readln().toInt()
    for(i in 1..num) readln().split(" ").map { it.toInt() }
    val all = num*100
}