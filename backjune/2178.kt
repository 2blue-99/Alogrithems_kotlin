package com.example.alogrithems.backjune

/**
 * 2023-12-05
 * pureum
 */
fun main(){
    // 시작 위치와 도착 위치도 개수 포함
    // bfs 풀이
    val (maxY,maxX) = readln().split(" ").map { it.toInt() }

    val inputArr = Array(maxY){IntArray(maxX)}
    val visitArr = Array(maxY){BooleanArray(maxX)}
    val queue = ArrayDeque<List<Int>>()

    repeat(maxY){
        inputArr[it] = readln().chunked(1).map { it.toInt() }.toIntArray()
    }

    queue.addLast(listOf(0,0,1))
    while (queue.isNotEmpty()){
        val (y,x,count) = queue.removeFirst()
        if(y<0 || x<0 || y>=maxY || x>=maxX) continue
        if(inputArr[y][x] == 0) continue
        if(visitArr[y][x]) continue
        inputArr[y][x] = count
        visitArr[y][x] = true

        queue.addLast(listOf(y+1,x,count+1))
        queue.addLast(listOf(y-1,x,count+1))
        queue.addLast(listOf(y,x+1,count+1))
        queue.addLast(listOf(y,x-1,count+1))
    }
    println(inputArr[maxY-1][maxX-1])
}