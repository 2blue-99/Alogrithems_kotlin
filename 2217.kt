package com.example.alogrithems

/**
 * 2023-04-03
 * pureum
 */

fun main(){
    var num = readln().toInt()
    var myList = arrayListOf<Int>()
    var myMax = 0
    for(i in 1..num){ myList.add(readln().toInt()) }
    myList.sort()
    myList.reverse()
    for(i in 0 until myList.size){
        if(myList[i] * (i+1) > myMax) myMax = myList[i] * (i+1)
    }
    println(myMax)
}