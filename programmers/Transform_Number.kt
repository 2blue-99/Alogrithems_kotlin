package com.blue.algorithem_kotlin.programmers

import kotlin.math.*

fun main(){
    println(solution(10,40, 5))
    println(solution(10,40,30))
    println(solution(2, 5,4))
}
fun solution(x: Int, y: Int, n: Int): Int {
    var dp = IntArray(y+1)

    for(i in x..y){
        if (i != x && dp[i] == 0) {
            dp[i] = -1;
            continue
        }
        if(dp[y] != 0) break
        if(i+n <= y)
            dp[i+n] = if(dp[i+n] == 0) dp[i]+1 else min(dp[i+n], dp[i]+1)
        if(i*2 <= y)
            dp[i*2] = if(dp[i*2] == 0) dp[i]+1 else min(dp[i*2], dp[i]+1)
        if(i*3 <= y)
            dp[i*3] = if(dp[i*3] == 0) dp[i]+1 else min(dp[i*3], dp[i]+1)
    }
    return dp[y]

}