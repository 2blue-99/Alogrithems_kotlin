package com.blue.algorithem_kotlin.backjune

fun main(){
    // 문제 정의 : 주어진 조건에 맞춰 N개의 집을 칠하는 비용의 최솟값을 구하라
    // 조건 : n-1, n 의 색이 같아서는 안됨

    val n = readln().toInt()
    val dp = Array(3){ IntArray(n) }
    val input = mutableListOf<List<Int>>()

    repeat(n){
        input.add(readln().split(" ").map { it.toInt() })
    }

    dp[0][0] = input.first()[0]
    dp[1][0] = input.first()[1]
    dp[2][0] = input.first()[2]

    for(i in 1 until n){
        dp[0][i] = minOf(dp[1][i-1], dp[2][i-1]) + input[i][0]
        dp[1][i] = minOf(dp[0][i-1], dp[2][i-1]) + input[i][1]
        dp[2][i] = minOf(dp[0][i-1], dp[1][i-1]) + input[i][2]
    }
    println(minOf(dp[0][n-1], dp[1][n-1], dp[2][n-1]))
}