package com.example.alogrithems.backjune

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val (h,w,n) = readln().split(" ").map{it.toInt()}
    val arr = Array(h){IntArray(w){0}}
    val queue = ArrayDeque<List<Int>>()
    var maxCnt = 0

    repeat(n){
        val input = readln().split(" ").map{it.toInt()}
        arr[input[0]-1][input[1]-1] = 1
    }

    arr.forEach { println(it.contentToString()) }
    fun bfs(){
        val vArr = Array(h){BooleanArray(w){false}}
        var cnt = 0
        arr.forEach { println(it.contentToString()) }
        while(queue.isNotEmpty()){
            val (hh,ww) = queue.removeFirst()
            println("$hh $ww")
            if(hh<0 || ww<0 || hh>=h || ww>=w) continue
            if(vArr[hh][ww]) continue
            if(arr[hh][ww] != 1) continue
            arr[hh][ww] = 0
            vArr[hh][ww] = true
            cnt+=1
            queue.addLast(listOf(hh+1,ww))
            queue.addLast(listOf(hh-1,ww))
            queue.addLast(listOf(hh,ww+1))
            queue.addLast(listOf(hh,ww-1))
        }
        if(maxCnt<cnt) maxCnt = cnt
    }

    for(hh in 0 until h){
        for(ww in 0 until w){
            if(arr[hh][ww]==1){
                queue.addLast(listOf(hh,ww))
                bfs()
            }
        }
    }
    println(maxCnt)
}