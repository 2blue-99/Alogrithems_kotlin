package com.example.alogrithems

/**
 * 2023-02-27
 * pureum
 */

fun main(){
    println(readln().split(" ").map { it.toInt()*it.toInt() }.sum() % 10)
}