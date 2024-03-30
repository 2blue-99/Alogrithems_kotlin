package com.blue.algorithem_kotlin.backjune

fun main() {
    println(readln().split(" ").map { it.toInt() }.sorted().joinToString(" "))
}