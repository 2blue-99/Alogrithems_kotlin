package com.blue.algorithem_kotlin.backjune

import kotlin.math.abs

fun main(){
    val (a,b) = readln().split(" ").map { it.toLong() }
    println(abs(a-b))
}