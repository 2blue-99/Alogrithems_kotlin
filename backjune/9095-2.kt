package com.blue.algorithem_kotlin.backjune

fun main(){
    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    repeat(readln().toInt()) {
        val n = readln().toInt()
         if(n>3) {
             for (i in 4..n) {
                 dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
             }
         }
        println(dp[n])
    }
}