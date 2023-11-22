package com.example.alogrithems.backjune

import android.util.Log

/**
 * 2023-11-22
 * pureum
 */

fun main(){
    // 2 <= n <= 10000
    // 일단 map 입력받기
    // "-1"
    var arr =  Array(1000){ IntArray(1000){0} }
    var visitArr = Array(1000){ BooleanArray(1000){false} }
    var (n, m) = readln().split(" ").map { it.toInt() }
    for(i in 0 until n) {
        val gap = readln().split(" ").map { it.toInt() }
        for (k in 0 until m)
            arr[i][k] = gap[k]
    }
    var queue = ArrayDeque<List<Int>>()
    queue.addLast(listOf(0,1,1))
    queue.addLast(listOf(1,0,1))

    while(queue.isNotEmpty()){
        if(queue.isEmpty()) break
        val index = queue.removeFirst()
        val nowN = index.first()
        val nowM = index[1]
        val count = index.last()
        if(nowN < 0 || nowM < 0 || nowN >= n || nowM >= m) continue
        if(visitArr[nowN][nowM]) continue
        if(arr[nowN][nowM]==2) {
            queue.addLast(listOf(nowN+1, nowM, count+1))
            queue.addLast(listOf(nowN, nowM+1, count+1))
            continue
        }
        if(arr[nowN][nowM] == 0) continue

        if(arr[nowN][nowM]==1){
            arr[nowN][nowM] = count
            visitArr[nowN][nowM] = true
            queue.addLast(listOf(nowN, nowM+1, count+1))
            queue.addLast(listOf(nowN, nowM-1, count+1))
            queue.addLast(listOf(nowN+1, nowM, count+1))
            queue.addLast(listOf(nowN-1, nowM, count+1))
        }
    }


    for(i in 0 until n) {
        for (k in 0 until  m) {
            if (i==0 && k==1 || i==1 && k==0)
                continue
            if(arr[i][k]==1)
                arr[i][k] = -1
        }
    }


    for(i in 0 until n) {
        for (k in 0 until  m) {
            print("${arr[i][k]} ")
        }
        println()
    }
}