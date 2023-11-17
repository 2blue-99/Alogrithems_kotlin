package com.example.alogrithems.programmers

import kotlin.system.exitProcess

/**
 * 2023-11-14
 * pureum
 */
private lateinit var intArr : MutableList<MutableList<Int>>
private var maxH = 0
private var maxW = 0
private var myCount = 0
fun main(){
    intArr = mutableListOf(
        mutableListOf(1,0,1,1,1),
        mutableListOf(1,0,1,0,1),
        mutableListOf(1,0,1,1,1),
        mutableListOf(1,1,1,0,1),
        mutableListOf(0,0,0,0,1))
    maxH = intArr.size
    maxW = intArr[0].size

    gameMapDFS(0,0, 1)

    println(-1)
}

fun gameMapDFS(h:Int, w:Int, count: Int){
    if(maxH <= h || maxW <= w || h<0 || w<0) return
    if(intArr[h][w]==0 || intArr[h][w]==-1) return
    if(h+1 == maxH && w+1 == maxW) {
        println("$count")
        exitProcess(0)
    }
    intArr[h][w] = -1
    myCount++
//    println(intArr.forEach { println(it) })
//    println("$h, $w")
    gameMapDFS(h,w-1 , count+1)
    gameMapDFS(h,w+1, count+1)
    gameMapDFS(h+1,w, count+1)
    gameMapDFS(h-1,w, count+1)
}
