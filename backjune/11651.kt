package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val input = readln().split(" ").map { it.toInt() }
        list.add(Pair(input.first(), input.last()))
    }
    list.sortedWith(compareBy<Pair<Int, Int>>{ it.second }.thenBy { it.first })
        .forEach { println("${it.first} ${it.second}") }
}