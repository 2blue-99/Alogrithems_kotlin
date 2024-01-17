package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-02-17
 * pureum
 */

fun main(){
    val arrayList = arrayListOf<List<Int>>()
    for(i in 1..9) arrayList.add(readln().split(" ").map { it.toInt() })
    var max = -1
    var down = 0
    var right:Int
    var downDap=0
    var rightDap=0
    for(list in arrayList){
        right=0
        down++
        for(data in list){
            right++
            if(data>max) {
                max = data
                downDap = down
                rightDap = right
            }
        }
    }
    println(max)
    println("$downDap $rightDap")
}