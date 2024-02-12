package com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val (n,s) = readln().split(" ").map{ it.toInt() }
    val input = readln().split(" ").map { it.toInt() }
    var count = 0

    // 사용 배열 만들기

    fun backTracking(k: Int, sum: Int){
        if(k==n) {
            if (sum == s)
                count += 1
            return
        }

        backTracking(k+1, sum+input[k])
        backTracking(k+1, sum)
    }

    backTracking(0,0)

    println(if(s==0) count-1 else count)
}