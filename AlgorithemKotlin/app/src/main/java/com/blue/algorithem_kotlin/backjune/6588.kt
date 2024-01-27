package com.blue.algorithem_kotlin.backjune

import kotlin.math.sqrt

fun main() {
    // 4보다 큰 모든 짝수는, 두 홀수 소수의 합으로 나타낼 수 있음

    fun isMinority(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2 until sqrt(num.toDouble()).toInt() + 1) {
            if (num % i == 0)
                return false
        }
        return true
    }

    while (true) {
        val n = readln().toInt()
        var result = emptyList<Int>()

        if (n == 0) break

        for (i in 3..n) {
            if (i % 2 == 0) continue
            if ((n - i) % 2 == 0) continue
            if (!isMinority(i)) continue
            if (isMinority(n - i)) {
                result = listOf(i, n - i)
                break
            }
        }
        if (result.isEmpty()) println("Goldbach's conjecture is wrong.")
        else println("$n = ${result.first()} + ${result.last()}")
    }
}