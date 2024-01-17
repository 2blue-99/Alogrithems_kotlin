package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-21
 * pureum
 */

fun main(){
    println(test10870(readln().toInt()))
}

fun test10870(num: Int): Int{
    return when(num){
        0 -> 0
        1 -> 1
        else -> test10870(num-1) + test10870(num-2)
    }
}