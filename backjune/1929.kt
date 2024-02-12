package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune



/**
 * 2023-01-28
 * pureum
 */
import kotlin.math.sqrt
fun main(){
    val (min,max) = readln().split(" ").map { it.toInt() }
    for(gap in min..max){
        if(gap == 1) continue
        if(gap == 2) {
            println(gap)
            continue
        }
        var count=2
        while(true){
            if(count > sqrt(gap.toDouble())) {
                println(gap)
                break
            }
            if(gap % count == 0 ){ break }
            count++
        }
    }
}
// 약수가 1과 자기자신 2개