package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 2023-12-18
 * pureum
 */

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))

    val (maxW, maxH) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(maxH){intArrayOf()}
    var max = 0
    repeat(maxH){
        arr[it] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    val queue = ArrayDeque<List<Int>>()

    for(h in 0 until maxH ){
        for(w in 0 until maxW){
            if(arr[h][w] == 1){
                arr[h][w]=0
                queue.addLast(listOf(h,w,0))
            }
        }
    }

    while(queue.isNotEmpty()){
        val (h,w,count) = queue.removeFirst()
        if(h<0 || w<0 || h>=maxH || w>=maxW) continue
        if(arr[h][w] != 0) continue
        arr[h][w] = 1
        max = count

        queue.addLast(listOf(h + 1, w, count+1))
        queue.addLast(listOf(h - 1, w, count+1))
        queue.addLast(listOf(h, w + 1, count+1))
        queue.addLast(listOf(h, w - 1, count+1))
    }

    for(h in 0 until maxH ){
        for(w in 0 until maxW){
            if(arr[h][w] == 0){
                queue.addLast(listOf(h,w,0))
            }
        }
    }

    if(queue.isNotEmpty()){
        println(-1)
    }else{
        println(max)
    }
}