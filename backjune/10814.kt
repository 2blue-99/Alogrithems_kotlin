package com.blue.algorithem_kotlin.backjune

fun main() {
    val map = mutableMapOf<Pair<Int, String>, Int>()
    val n = readln().toInt()
    for (i in 0 until n) {
        val input = readln().split(" ")
        val pair = Pair(input.first().toInt(), input.last())
        map[pair] = map.getOrDefault(pair, i)
    }
    map.toList().sortedWith(compareBy({ it.first.first }, { it.second })).forEach {
        println(it.first.toList().joinToString(" "))
    }
}