package com.example.alogrithems.backjune

/**
 * 2023-03-29
 * pureum
 */

fun main(){
    val (num, gap) = readln().split(" ").map { it.toInt() }
    val myArray = arrayListOf<Int>()
    var maxCount = 0
    for(i in 1..num){
        var myGap = readln().toInt()
        if(myGap>gap) break
        myArray.add(myGap)
    }

    for( k in 0 until myArray.size) {
        var myHap = 0
        var count = 0
        for (i in myArray.reversed().slice(k until myArray.size)) {
            while (myHap + i <= gap) {
                myHap += i
                count++
            }
        }
        if(k == 0) maxCount = count
        else if(maxCount > count) maxCount = count
    }
    println(maxCount)
}