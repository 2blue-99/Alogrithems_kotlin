package com.example.alogrithems

/**
 * 2023-10-04
 * pureum
 */

fun main(){
    val(num, count) = readln().split(" ").map { it.toInt() }
    val myList = (1..num).toMutableList()
    repeat(count){
        val (a,b) = readln().split(" ").map { it.toInt() }
        var temp = myList[a-1]
        myList[a-1] = myList[b-1]
        myList[b-1] = temp
    }
    myList.map { print("$it ") }
}