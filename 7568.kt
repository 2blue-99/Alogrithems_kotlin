package com.example.alogrithems

/**
 * 2023-01-31
 * pureum
 */
fun main(){
    var people = readln().toInt()
    var list = arrayListOf<List<Int>>()
    var compareList = list.toArray()
    for(i in 1..people)
        list.add(readln().split(" ").map { it.toInt() })


}