package com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,k) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n){ br.readLine().toInt() }
    var cnt = 0

    fun bt(sum: Int, start: Int){
        if(sum==k) {
            cnt++
            return
        }
        for(i in start until n){
            if(sum+arr[i]>k) continue
            bt(sum+arr[i],i)
        }
    }
    bt(0,0)
    println(cnt)
}