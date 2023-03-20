package com.example.alogrithems

import kotlin.math.max

fun main(){
    val nums = readln().toInt()
    val score = Array(nums+1){0}
    val hap = Array(nums+1){0}
    for(i in 1..nums){
        score[i] = readln().toInt()
    }

    for(k in 1..nums){
        when (k) {
            1 -> hap[k] = score[k]
            2 -> hap[k] = score[k]+score[k-1]
            else -> {
                hap[k] = max(hap[k-2]+score[k], hap[k-3]+score[k-1]+score[k])
            }
        }
    }
    println(hap[nums])
}

