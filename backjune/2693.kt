package com.blue.algorithem_kotlin.backjune

fun main() {
    repeat(readln().toInt()) {
        println(readln().split(" ").map { it.toInt() }.sortedDescending()[2])
    }
}