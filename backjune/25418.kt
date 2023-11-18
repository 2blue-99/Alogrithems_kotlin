package com.example.alogrithems.backjune

import android.media.session.MediaSession.QueueItem

/**
 * 2023-11-18
 * pureum
 */

fun main() {
    val (a, k) = readln().split(" ").map { it.toInt() }
    var queue = ArrayDeque<List<Int>>()
    var visitList = Array(1_000_001){false}
    queue.addLast(listOf(a,0))
    while (true) {
        if(queue.isEmpty()) break
        val (nowA,count) = queue.removeFirst() // pop
        if(visitList[nowA]) continue
        if(nowA == k) {
            println(count)
            break
        }
        if(k >= nowA * 2){
            visitList[nowA] = true
            queue.addLast(listOf(nowA*2, count+1))
        }
        if(k >= nowA+1){
            visitList[nowA] = true
            queue.addLast(listOf(nowA+1, count+1))
        }
    }
}


//fun main() {
//    val (a, k) = readln().split(" ").map { it.toInt() }
//    var now = k
//    var count = 0
//    while (true) {
//        if(now == a) break
//        if(now % 2 == 0 && now / 2 >= a){
//            now /= 2
//        }else{
//            now -= 1
//        }
//        count++
//        println(now)
//    }
//    println(count)
//}