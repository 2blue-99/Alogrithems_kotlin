package com.example.alogrithems

import kotlin.math.sqrt

/**
 * 2023-01-29
 * pureum
 */
fun main(){
    while(true){
        val gap = readln().toInt()
        var count = 0
        if(gap==0) break
        else if(gap==1) {
            println(1)
            continue
        }else{
            for(num in (gap+1)..(2*gap)){
                var sosuCount = 2
                while(true){
                    if(sosuCount > sqrt(num.toDouble())) {
                        count++
                        break
                    }else if(num%sosuCount == 0) break
                    sosuCount++
                }
            }
        }
        println(count)
    }
}