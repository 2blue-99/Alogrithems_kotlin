package com.example.alogrithems

/**
 * 2023-01-31
 * pureum
 */
fun main(){
    var people = readln().toInt()
    var list = arrayListOf<List<Int>>()
    for(i in 1..people) list.add(readln().split(" ").map { it.toInt() })

    for(i in 0 until people){
        var count = 1
        for(gap in list) if(list[i][0] < gap[0] && list[i][1] < gap[1]) count++
        print("$count ")
    }
}