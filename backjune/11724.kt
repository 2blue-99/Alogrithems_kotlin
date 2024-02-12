package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n+1){ mutableListOf<Int>() }
    val vArr = BooleanArray(n+1){false}
    var count = 0
    repeat(m){
        val (s,e) = br.readLine().split(" ").map { it.toInt() }
        arr[s].add(e)
        arr[e].add(s)
    }

    fun dfs(list: MutableList<Int>){
        for(i in list){
            if(vArr[i]) continue
            vArr[i] = true
            dfs(arr[i])
        }
    }

    for(i in 1 until arr.size){
        if(!vArr[i]){
            dfs(arr[i])
            count++
        }
    }

    bw.write("$count\n")
    bw.flush()
    bw.close()
}