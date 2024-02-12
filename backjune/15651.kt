package com.blue.algorithem_kotlin.backjune

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n,m) = readln().split(" ").map{it.toInt()}
    val arr = IntArray(m)

    fun bt(k: Int){
        if(k == m){
            bw.write("${arr.joinToString(" ")}\n")
            return
        }
        for(i in 1..n){
            arr[k] = i
            bt(k+1)
        }

    }
    bt(0)
    bw.flush()
    bw.close()
}