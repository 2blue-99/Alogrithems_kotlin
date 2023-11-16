package com.example.alogrithems

import java.lang.Exception

/**
 * 2023-11-16
 * pureum
 */

private val arr = ArrayList<MutableList<String>>()
private var maxN = 0
private var maxM = 0
private var myCount = 0
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() } // 4 4
    maxN = n
    maxM = m
    repeat(n) {
        arr.add(readln().chunked(1).toMutableList())
    }
    for(i in 0 until maxN)
        for(k in 0 until maxM)
            dfs1388(i,k)
    println(myCount)
}
// n 세로, m 세로
fun dfs1388(n: Int, m: Int){
    if(n>= maxN || m >= maxM) {
        myCount++
        return
    }
    if(arr[n][m] == "")
        return
    if(arr[n][m]=="-"){
        arr[n][m] = ""
        width(n, m+1)
    }
    else if(arr[n][m]=="|"){
        arr[n][m] = ""
        high(n+1, m)
    }
}
fun width(n: Int, m: Int){
    if(arr[n][m] != "-"){
        myCount++
        return
    }
    arr[n][m] = ""
    width(n, m+1)
}

fun high(n: Int, m: Int){
    if(arr[n][m] != "|"){
        myCount++
        return
    }
    arr[n][m] = ""
    high(n+1, m)
}