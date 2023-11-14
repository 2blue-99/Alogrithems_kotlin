package com.example.alogrithems

import kotlin.math.max


/**
 * 2023-08-02
 * pureum
 */
fun main(){
    var(N, L, W, H) = readln().split(" ").map { it.toInt() }
    var minGap = 0.0
    var maxGap = max(L,max(W,H)).toDouble()


    repeat(10000){
        val mid = ((minGap + maxGap) / 2)
        val gap = (L/mid).toInt() * (W/mid).toInt() * (H/mid).toInt()
        if(gap >= N)
            minGap = mid
        else
            maxGap = mid
    }
//    println(maxGap)
    println(String.format("%.1f", maxGap))
}