package com.blue.algorithem_kotlin.backjune

fun main() {
    var sum = 1
    for(i in 2..readln().toInt()){
        sum *= i
    }
    println(sum)
}