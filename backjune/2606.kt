package com.example.alogrithems.backjune

fun main(){

    val c = readln().toInt()
    val arr = Array(c+1){ mutableListOf<Int>() }
    val vArr = Array(c+1){false}
    var count = -1
    repeat(readln().toInt()){
        val(t,f) = readln().split(" ").map { it.toInt() }
        arr[t].add(f)
        arr[f].add(t)
    }
    val queue = ArrayDeque<Int>()
    queue.addLast(1)

    while(queue.isNotEmpty()){
        val num = queue.removeFirst()
        if(vArr[num]) continue
        vArr[num] = true
        count++
        arr[num].forEach{
            queue.addLast(it)
        }
    }
    println(count)
}