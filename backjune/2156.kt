package com.example.alogrithems.backjune

import kotlin.math.max

/**
 * 2023-03-15
 * pureum
 */

fun main() {
    val num = readln().toInt()
    val score = Array(num + 1) { 0 }
    val hap = Array(num + 1) { 0 }
    for (i in 1..num) {
        score[i] = readln().toInt()
    }
    for (k in 1..num) {
        when (k) {
            1 -> hap[k] = score[k]
            2 -> hap[k] = score[k] + score[k - 1]
            else -> {
                hap[k] = max(max(score[k] + hap[k - 2], hap[k-1]), score[k] + score[k - 1] + hap[k - 3])
            }
        }
    }
    println(hap.max())
}