package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-01-12
 * pureum
 */
fun main(){
    val gap = readln().toInt()
    var result = 0
    var fiveC = gap/5
    var threeC = -1
    while (true){
        while(result<gap){
            threeC++
            result=0
            result+=(fiveC*5) + (threeC*3)
        }
        if(result==gap || fiveC==0){ break }
        threeC=-1
        fiveC--
        result=0
    }
    if(result==gap) println(fiveC+threeC)
    else println(-1)
}