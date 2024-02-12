package com.example.alogrithems.programmers

fun main(){

    val g = listOf("classic", "pop", "classic", "classic", "pop")
    val p = listOf(500, 600, 150, 800, 2500)

    g.indices.groupBy { g[it] }
        .also { println(it) }
        .toList()
        .also { println(it) }
        .sortedByDescending { it.second.sumOf { p[it] } }
        .also { println(it) }
        .map { it.second.sortedByDescending { p[it] }.take(2) }
        .also { println(it) }
        .flatten()
        .also { println(it) }
        .toIntArray()


    // 0 a
    // 1 b
    // 2 c
    // 3 d
    // 4 a
    // 5 a


}