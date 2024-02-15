package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    println(n.toString().toList().map{it.toString()}.sortedDescending().joinToString(""))
}