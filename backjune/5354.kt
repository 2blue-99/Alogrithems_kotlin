package com.blue.algorithem_kotlin.backjune

fun main(){
    repeat(readln().toInt()){
        val n = readln().toInt()
        if(n==1)
            println("#\n")
        else {
            println("#".repeat(n))
            repeat(n - 2) {
                println("#" + "J".repeat(n - 2) + "#")
            }
            println("#".repeat(n))
            println()
        }
    }
}