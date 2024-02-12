package com.blue.algorithem_kotlin.backjune

fun main(){
        val n = readln().toInt()
        val a = readln().split(" ").map{it.toInt()}.toIntArray()
        val b = readln().split(" ").map{it.toInt()}.toIntArray()
        a.sort()
        b.sortDescending()
        println(a.indices.sumOf{ a[it] + b[it] })
}