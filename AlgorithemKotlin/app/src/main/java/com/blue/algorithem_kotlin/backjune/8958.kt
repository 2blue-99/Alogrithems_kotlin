package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-01-05
 * pureum
 */
fun main(){
    val gaps = arrayListOf<List<String>>()
    var num = readln().toInt()
    for(i in 1..num)
        gaps.add(readln().split(""))
    for(i in gaps){
        var count=0
        var plus=0
        for(k in i){
            if(k == "O") {
                plus++
                count += plus
            }
            else
                plus=0
        }
        println(count)
    }
}