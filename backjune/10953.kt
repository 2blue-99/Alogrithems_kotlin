package com.blue.algorithem_kotlin.backjune

fun main(){
    repeat(readln().toInt()){
        val (a,b) = readln().split(",").map { it.toInt() }
        println(a+b)
    }
}