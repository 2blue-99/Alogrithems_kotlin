package com.example.alogrithems

/**
 * 2023-03-31
 * pureum
 */

fun main() {
    var num = readln().toInt()
    var myList = mutableListOf<List<Int>>()
    for (i in 1..num) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        myList.add(listOf(start, end))
    }

    myList.sortWith(compareBy<List<Int>> {it[1]}.thenBy{it[0]})
//    myList.forEach { println(it) }

    var count = 1
    var time = myList[0][1]
    for(i in 1 until num){
        if(myList[i][0]>=time){
            time = myList[i][1]
            count++
        }
    }
    println(count)
}