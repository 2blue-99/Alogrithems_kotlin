package com.example.alogrithems.backjune

/**
 * 2022-12-27
 * pureum
 */

fun main(){
    val gap = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    var num = 0
    for(i in 0..2)
         if(gap.count { it == gap[i] } >= count) {
             count = gap.count { it == gap[i] }
             num = gap[i]
         }

    if(count==1)
        println(gap.max() * 100)
    else if(count==2)
        println(1000+num*100)
    else
        println(10000+num*1000)
}
