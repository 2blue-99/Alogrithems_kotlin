package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    var sum = 1L
    for(i in 1..n){
        sum *= i
    }
    println(sum)
}