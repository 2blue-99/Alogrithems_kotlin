package com.blue.algorithem_kotlin.backjune

fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(m)

    fun dfs(k: Int, before: Int){
        if(k == m){
            println(arr.joinToString(" "))
            return
        }
        for(i in 1..n){
            if(i > before){
                arr[k] = i
                dfs(k+1, i)
            }
        }
    }
    dfs(0, 0)
}