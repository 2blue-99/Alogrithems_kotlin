package com.example.alogrithems.backjune

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
    val vArr = Array(maxH){BooleanArray(maxW){false} }
    var count = 0
    repeat(maxH){
        arr[it] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    val queue = ArrayDeque<List<Int>>()
    while(true) {

        var uncooked = false

        for (h in 0 until maxH) {
            for (w in 0 until maxW) {
                if(arr[h][w] == 1 && !vArr[h][w]){
                    vArr[h][w] = true
                    queue.addLast(listOf(h + 1, w))
                    queue.addLast(listOf(h - 1, w))
                    queue.addLast(listOf(h, w + 1))
                    queue.addLast(listOf(h, w - 1))
                }
                if(arr[h][w] == 0)
                    uncooked = true
            }
        }

        if(queue.isEmpty()){
            if(uncooked) {
                println(-1)
                break
            }else{
                println(--count)
                break
            }
        }

        while(queue.isNotEmpty()){
            val (h,w) = queue.removeFirst()
            if(h<0 || w<0 || h>=maxH || w>=maxW) continue
            if(arr[h][w] != 0) continue
            if(vArr[h][w]) continue
            arr[h][w] = 1
        }
        count++
    }
}