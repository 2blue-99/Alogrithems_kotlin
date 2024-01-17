package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-11-21
 * pureum
 */

fun main(){
    var input = readln().toLong()
    var count = 0L
    var now = 0L
    for(i in 1L..input){
        now+=i
        count++
        if(now + (i+1L) >= input) {
            if(now + (i+1L) == input) count++
            break
        }
    }
    println(count)
}