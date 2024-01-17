package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-01-05
 * pureum
 */
fun main(){
    val mems = readln().toInt()
    for(i in 1..mems) {
        val gaps = readln().split(" ").map { it.toDouble() }
        val list = gaps.slice(1 until gaps.size)
        val aver = list.average()
        var count=0
        list.forEach{ if(it>aver) count++ }
        println("${String.format("%.3f", count / gaps[0] * 100)}%")
    }
}