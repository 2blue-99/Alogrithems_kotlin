package com.example.alogrithems.backjune

/**
 * 2023-11-19
 * pureum
 */

//13195193800
fun main(){
    var startTime = System.nanoTime()
    var set = mutableSetOf<String>()
    var input = readln()
    for(i in 0..input.length){ // 0 1 2 3 4
        for(k in i+1..input.length){ // 0 until input.size 0 1 2 3 4 5
            set.add(input.substring(i,k))
        }
    }
    var endTime = System.nanoTime()
    println(endTime - startTime)
    println(set.size)
}



// 2135820400
// set을 사용했으나 실패
//fun main(){
//    var startTime = System.nanoTime()
//    var set = mutableSetOf<List<String>>()
//    var input = readln().chunked(1)
//    for(i in input.indices){ // 0 1 2 3 4
//        for(k in input.indices){ // 0 until input.size 0 1 2 3 4 5
//            if(k+i >= input.size) break
//            set.add(input.slice(k..k+i))
//        }
//    }
//    var endTime = System.nanoTime()
//    println(endTime - startTime)
//    println(set.size)
//}