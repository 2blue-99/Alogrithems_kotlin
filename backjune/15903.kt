package com.example.alogrithems.backjune

/**
 * 2023-04-11
 * pureum
 */

fun main(){
    var (nums, game) = readln().split(" ").map { it.toInt() }
    var myList = readln().split(" ").map { it.toLong() }

    for(i in 1..game){
        myList = myList.sorted().toMutableList()
        var gap = myList[0] + myList[1]
        myList[0] = gap
        myList[1] = gap
    }
    println(myList.sum())
}