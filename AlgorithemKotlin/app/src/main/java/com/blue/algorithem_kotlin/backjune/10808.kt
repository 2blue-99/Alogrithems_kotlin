package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-12
 * pureum
 */
fun main(){
    val arr = Array(26){0}
    val gap = readln()
    for(k in gap)
        arr[k.minus('a')]++
    arr.forEach { print("$it ") }
}
