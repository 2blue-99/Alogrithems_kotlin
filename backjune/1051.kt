package com.blue.algorithem_kotlin.backjune

import kotlin.math.*
fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val input = Array(n){i -> readln() }
    var result = 1
    for(r in 0 until n){
        for(c in 0 until m){//2
            val target = input[r][c]
            for(tc in c+1 until m){//4
                if(input[r][tc] == target){
                    val len = tc - c
                    if(r+len >= n) continue
                    if(input[r+len][c] == target && input[r+len][tc] == target){
                        result = max(result, (len+1) * (len+1))
                    }
                }
            }
        }
    }
    println(result)
}