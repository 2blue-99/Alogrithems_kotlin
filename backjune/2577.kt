package com.blue.algorithem_kotlin.backjune

fun main(){
    val a = readln().toLong()
    val b = readln().toLong()
    val c = readln().toLong()
    val map = mutableMapOf<Int, Int>()
    (a * b * c).toString().forEach {
        map[it.toString().toInt()] = map.getOrDefault(it.toString().toInt(), 0)+1
    }
    repeat(10){
        println(map.getOrDefault(it, 0))
    }
}