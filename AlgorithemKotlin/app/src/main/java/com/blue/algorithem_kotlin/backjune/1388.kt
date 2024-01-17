package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune
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
        for (k in 0 until maxM)
            dfs1388(i, k, " ")
    println(myCount)
}
fun dfs1388(n: Int, m: Int, before: String){
    if(n>= maxN || m >= maxM) {
        myCount++
        return
    }
    if(arr[n][m] == " " && before == " ") return
    if(arr[n][m]=="-" && (before == "-" || before == " ")){
        arr[n][m] = " "
        dfs1388(n, m+1, "-")
    }
    else if(arr[n][m]=="|" && (before == "|" || before == " ")){
        arr[n][m] = " "
        dfs1388(n+1, m, "|")
    }else{
        myCount++
        return
    }
}