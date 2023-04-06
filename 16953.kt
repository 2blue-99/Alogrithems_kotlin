package com.example.alogrithems

/**
 * 2023-04-04
 * pureum
 */

fun main(){
    var (start, end) = readln().split(" ")
    var count = 0
    if(end.toInt() % 10 != 1 && end.toInt()%2 != 0) println(-1)
    else {
        while (true) {
            end = if (end.toInt() % 10 == 1 && end.length > 1) {
                end.slice(0 until end.lastIndex)
            }else if(end.toInt() % 2 == 0){
                (end.toInt()/2).toString()
            }else{
                println(-1)
                break
            }
            count++
            if(end == start) {
                println(count+1)
                break
            }
        }
    }
}