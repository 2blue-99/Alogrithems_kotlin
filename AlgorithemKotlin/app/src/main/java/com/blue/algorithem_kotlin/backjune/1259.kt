package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

fun main(){
    while(true){
        val num = readln().toInt()
        if(num == 0) break
        val gap = num.toString().chunked(1).reversed()
        if(num == gap.joinToString("") .toInt())
            println("yes")
        else
            println("no")
    }
}