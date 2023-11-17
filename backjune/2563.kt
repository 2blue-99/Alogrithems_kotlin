package com.example.alogrithems.backjune

/**
 * 2023-02-17
 * pureum
 */

fun main() {
    val num = readln().toInt()
    val list = Array(100){BooleanArray(100)}
    var dap = 0
    for (i in 1..num) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        for (z in y until y+10) {
            for (k in x until x + 10) {
                if (list[z][k]) continue
                list[z][k] = true
                dap++
            }
        }
    }
    println(dap)
}

