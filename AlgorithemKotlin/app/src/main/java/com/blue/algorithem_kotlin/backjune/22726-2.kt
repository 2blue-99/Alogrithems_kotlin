package com.blue.algorithem_kotlin.backjune

fun main(){
    val n = readln().toInt()
    val dp = IntArray(n+1)
    dp[0] = 1
    dp[1] = 2
    for(i in 2 until n){
        dp[i] = ((dp[i-1] % 10_007) + (dp[i-2] % 10_007)) % 10_007
    }
    println(dp[n-1] )
}