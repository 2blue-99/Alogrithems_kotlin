package com.example.alogrithems.backjune

/**
 * 2023-12-01
 * pureum
 */

fun main(){
    // 2진수 중 01, 10은 못만듦
    // 1 <= N <= 1_000_000
    val arr = Array(1_000_001){0}
    val num = readln().toInt()
    for(i in 1..num) {
        when(i){
            1 -> arr[1] = 1
            2 -> arr[2] = 2
            else -> arr[i] = (arr[i-1] + arr[i-2]) % 15746
        }
    }
    println(arr[num])
}