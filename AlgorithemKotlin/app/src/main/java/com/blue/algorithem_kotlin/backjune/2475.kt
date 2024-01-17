package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-02-27
 * pureum
 */

fun main(){
    println(readln().split(" ").map { it.toInt()*it.toInt() }.sum() % 10)
}