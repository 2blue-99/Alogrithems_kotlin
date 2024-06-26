package com.blue.algorithem_kotlin.backjune

fun main() {
    val list = mutableMapOf<String, Int>()
    repeat(readln().toInt()){
        val (name,rank) = readln().split(" ")
        list[name] = rank.toInt()
    }
    println(list.toList().sortedWith(compareByDescending<Pair<String,Int>>{it.second}.thenBy{it.first}).first().first)
}