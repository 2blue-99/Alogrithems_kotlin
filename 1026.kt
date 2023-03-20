package com.example.alogrithems

import kotlin.math.ceil
import kotlin.math.min

/**
 * 2023-03-20
 * pureum
 */

fun main(){
    val (broken,num) = readln().split(" ").map { it.toInt() }
    val bundle = broken / 6
    val piece = broken % 6
    var b = arrayListOf<Int>()
    var p = arrayListOf<Int>()

    for(i in 1..num){
        val (B,P) = readln().split(" ").map { it.toInt() }
        b.add(B)
        p.add(P)
    }

    val mixedDap = b.min() * bundle + p.min() * piece
    val pieceDap = p.min() * broken
    val bundleDap = b.min() * (bundle+1)
    println(min(min(mixedDap, pieceDap), bundleDap))
}