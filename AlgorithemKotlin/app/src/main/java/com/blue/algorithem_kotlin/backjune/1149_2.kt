package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    val dpR = IntArray(n + 1)
    val dpG = IntArray(n + 1)
    val dpB = IntArray(n + 1)

    val input = Array(n + 1) { Triple(0, 0, 0) }

    repeat(n) {
        val list = readln().split(" ").map { it.toInt() }
        input[it+1] = Triple(list[0], list[1], list[2])
    }

    println(input.contentToString())

    dpR[1] = input[1].first
    dpG[1] = input[1].second
    dpB[1] = input[1].third



    for (i in 2..n) {
        dpR[i] = minOf(dpG[i-1], dpB[i-1]) + input[i].first
        dpG[i] = minOf(dpR[i-1], dpB[i-1]) + input[i].second
        dpB[i] = minOf(dpR[i-1], dpG[i-1]) + input[i].third
    }

    println(listOf(dpR[n], dpG[n], dpB[n]).min())
}