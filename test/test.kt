package com.example.alogrithems.test

import java.util.LinkedList
import java.util.Queue

/**
 * 2023-11-18
 * pureum
 */

//fun main() {
//    val input = readln().toInt()
//    var sum = 0
//    val start = System.nanoTime()
//    repeat(input){
//        sum += it + 1
//    }
//    val end = System.nanoTime()
//
//    println(end - start)
//}

fun main() {
    val input = readln().toInt()
    var sum = 0
    val start = System.nanoTime()
    for(i in 1..input){
        sum += i
    }
    val end = System.nanoTime()

    println(end - start)
}


// 재귀 천 : 120200
//repeat 천 : 11900
//for 천 : 9000
//fun main() {
//    val input = readln().toInt()
//    val start = System.nanoTime()
//    fun dfs(num : Int): Int{
//        if(num == 1) return 1
//        return num + dfs(num - 1)
//    }
//    dfs(input)
//    val end = System.nanoTime()
//
//    println(end - start)
//}