package com.blue.algorithem_kotlin.backjune

fun main() {
    val list = mutableListOf<Pair<Pair<Int, String>, Int>>()
    val n = readln().toInt()
    for (i in 0 until n) {
        val input = readln().split(" ")
        val pair = Pair(Pair(input.first().toInt(), input.last()), i)
        list.add(pair)
    }
    list.sortedWith(compareBy({ it.first.first }, { it.second })).forEach {
        println(it.first.toList().joinToString(" "))
    }
}