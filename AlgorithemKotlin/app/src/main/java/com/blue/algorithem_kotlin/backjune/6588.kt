package com.blue.algorithem_kotlin.backjune

import kotlin.math.sqrt

fun main() {
    // 골드바흐 -> 4보다 큰 모든 짝수는, 두 홀수 소수의 합으로 나타낼 수 있음
    val sosuArr = BooleanArray(1_000_001){true}

    for(i in 2..sqrt(sosuArr.size.toDouble()).toInt()+1){
        if(sosuArr[i]){
            var j = 2
            while (i*j <sosuArr.size){
                sosuArr[i * j] = false
                j++
            }
        }
    }

    while (true) {
        val n = readln().toInt()
        if(n == 0 ) break
        for (i in 2..n) {
            if(sosuArr[i] && sosuArr[n-i]){
                println("$n = $i + ${n-i}")
                break
            }
        }
    }
}