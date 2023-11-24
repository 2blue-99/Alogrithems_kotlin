package com.example.alogrithems.backjune

/**
 * 2023-11-24
 * pureum
 */

import kotlin.math.abs
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el ): List<List<T>> {
    return if(sub.isEmpty()) listOf(fin)
    else sub.flatMap {
        permutation(el, fin + it, sub - it)
    }
}

fun main() {
    val num = readln().toInt()
    val inputList = readln().split(" ").map { it.toInt() }
    val list5 = permutation(inputList)
    var max = 0
//    list5.forEach { print("$it ") }

    for(i in list5){
        var hap = 0
        for(k in 0 until num-1){
            hap += abs(i[k] - i[k+1])
        }
        if(hap > max)
            max = hap
    }
    println(max)
}