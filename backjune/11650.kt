package com.blue.algorithem_kotlin.backjune

fun main() {

    val n = readln().toInt()
    val list = mutableListOf<List<Int>>()
    repeat(n){
        val input = readln().split(" ").map{it.toInt()}
        list.add(input)
    }
    list.sortedWith(compareBy<List<Int>>{it[0]}.thenBy{it[1]}).forEach{println(it.joinToString(""))}

    list.sortedWith(compareByDescending<List<Int>> {it[0]}.thenBy{it[1]})

    list.sortedWith(compareByDescending<List<Int>> {it[0]}.thenBy{it[1]})
}