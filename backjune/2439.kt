package com.blue.algorithem_kotlin.backjune

fun main(){
    val n = readln().toInt()
    repeat(n){
        print(" ".repeat(n-it-1))
        println("*".repeat(it+1))
    }
}