package com.example.alogrithems

import java.lang.Exception

/**
 * 2023-02-15
 * pureum
 */


fun main() = with(System.out.bufferedWriter()){
    val brr = System.`in`.bufferedReader()
    var hashMap = HashMap<String,Int>()
    val list = arrayListOf<String>()
    val dap = arrayListOf<String>()
    val (input, data) = brr.readLine().split(" ").map { it.toInt() }
    for(i in 0 until input){
        val gap = brr.readLine()
        list.add(gap)
        hashMap[gap] = i
    }
    for(i in 0 until data){
        val myData = brr.readLine()
        try {
            myData.toInt()
            dap.add(list[myData.toInt()-1])
        }catch (e:Exception){
            dap.add((hashMap[myData]!!+1).toString())
        }
    }
    dap.forEach { println(it) }
}