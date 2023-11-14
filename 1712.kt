package com.example.alogrithems

/**
 * 2023-08-03
 * pureum
 */

fun main(){
    var (a, b, c) = readln().split(" ").map { it.toLong() }
    var spendMoney = 0L
    var earnMoney = 0L
    var count = 0
    while(true){
        spendMoney = a + b*count
        earnMoney = c * count
        if(spendMoney < earnMoney) {
            println(count)
            break
        }
        if(b >= c) {
            println(-1)
            break
        }
        count++
    }
}