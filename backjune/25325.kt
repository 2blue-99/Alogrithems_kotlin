package com.blue.algorithem_kotlin.backjune

fun main() {

    val map = mutableMapOf<String, Int>()
    val n = readln().toInt()

    readln().split(" ").forEach {
        map[it] = 0
    }

    repeat(n) {
        readln().split(" ").forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
    }
    map.toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })
        .forEach { println("${it.first} ${it.second}") }
}