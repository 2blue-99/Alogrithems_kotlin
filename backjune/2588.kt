package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2022-12-27
 * pureum
 */

fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.split("").slice(1..3).map { it.toInt() }
    println(a*b[2])
    println(a*b[1])
    println(a*b[0])
    println(a*b.joinToString("").toInt())
}