package com.example.alogrithems.backjune

/**
 * 2023-11-18
 * pureum
 */

fun main() {
    val (a, k) = readln().split(" ").map { it.toInt() }
    var now = k
    var count = 0
    while (true) {
        if(now == a) break
        if(now % 2 == 0 && now / 2 >= a){
            now /= 2
        }else{
            now -= 1
        }
        count++
        println(now)
    }
    println(count)
}