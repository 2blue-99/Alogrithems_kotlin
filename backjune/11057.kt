package com.example.alogrithems.backjune

/**
 * 2023-03-15
 * pureum
 */

import kotlin.math.max

fun main(){
    val nums = readln().toInt()
    val score = Array(nums+1){0}
    val save = Array(nums+1){0}
    for(i in 1..nums){
        score[i] = readln().toInt()
    }
    for(k in 1..nums){
        when (k) {
            1 -> save[k] = score[1]
            2 -> save[k] = score[1] + score[2]
            else -> {
                save[k] = max(save[k-2] + score[k], save[k-3] + score[k-1]+ score[k])
            }
        }
    }
    println(save[nums])
}