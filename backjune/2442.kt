package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    for(i in 1..n){
        print(" ".repeat(n-i))
        println("*".repeat(2*i-1))
    }
}