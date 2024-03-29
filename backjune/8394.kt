package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1)

    for (i in 1..n) {
        when (i) {
            1 -> dp[i] = 1
            2 -> dp[i] = 2
            3 -> dp[i] = 3
            else -> dp[i] = (dp[i - 1] + dp[i - 2]).toString().last().toString().toInt()
        }
    }
    println(dp[n])
}