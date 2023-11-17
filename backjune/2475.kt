package com.example.alogrithems.backjune

/**
 * 2023-02-27
 * pureum
 */

fun main(){
    println(readln().split(" ").map { it.toInt()*it.toInt() }.sum() % 10)
}