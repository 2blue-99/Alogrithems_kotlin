package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 2023-11-22
 * pureum
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr =  Array(1000){ IntArray(1000){0} }
    val visitArr = Array(1000){ BooleanArray(1000){false} }
    val baseList = arrayListOf<List<Int>>()
    var twoN = 0
    var twoM = 0

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    for(i in 0 until n) {
        var gap = br.readLine().split(" ").map { it.toInt() }
        for (k in 0 until m) {
            arr[i][k] = gap[k]
            if(gap[k] == 2) {
                twoN = i
                twoM = k
            }
        }
    }

    baseList.add(listOf(twoN+1,twoM,1))
    baseList.add(listOf(twoN-1,twoM,1))
    baseList.add(listOf(twoN,twoM+1,1))
    baseList.add(listOf(twoN,twoM-1,1))

    arr[twoN][twoM] = 0

    val queue = ArrayDeque<List<Int>>()
    for(i in baseList)
        queue.addLast(i)


    while(queue.isNotEmpty()){

        val index = queue.removeFirst()
        val nowN = index.first()
        val nowM = index[1]
        val count = index.last()

        if(nowN < 0 || nowM < 0 || nowN >= n || nowM >= m) continue
        if(visitArr[nowN][nowM]) continue
        if(arr[nowN][nowM] == 0) continue
        if(arr[nowN][nowM] == 2) continue

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
            if(arr[i][k]==1) {
                if((i == twoN+1 && k == twoM) || (i == twoN && k == twoM+1) || (i == twoN-1 && k == twoM) || (i == twoN && k == twoM-1)){
                    bw.write("${arr[i][k]} ")
                    continue
                }
                bw.write("-1 ")
            }else{
                bw.write("${arr[i][k]} ")
            }
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}