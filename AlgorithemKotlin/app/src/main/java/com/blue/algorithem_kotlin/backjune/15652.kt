package com.blue.algorithem_kotlin.backjune

fun main(){

    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = mutableListOf<Int>()
    val bw = System.out.bufferedWriter()

    fun dt(k: Int, start:Int){
        if(arr.size == m){
            bw.write("${arr.joinToString(" ")}\n")
            return
        }
        for(i in start until n){
            arr.add(i+1)
            dt(k+1, i)
            arr.removeLast()
        }
    }
    dt(0,0)
    bw.flush()
    bw.close()
}