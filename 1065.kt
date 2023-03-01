package com.example.alogrithems

/**
 * 2023-02-26
 * pureum
 */

fun main(){
    val num = readln().toInt()
    var count=100
    var dap = 0
    if(num < 100) println(num)
    else{
        while(count <= num) {
            val gap = count.toString().chunked(1).map { it.toInt() }
            if (gap[1] - gap[0] == gap[2] - gap[1]) {
                dap++
            }
            count += 1
        }
        println(dap+99)
    }
}