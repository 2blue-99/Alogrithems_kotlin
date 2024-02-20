package com.blue.algorithem_kotlin.backjune

fun main() {
    val(n,m) = readln().split(" ").map{it.toInt()}
    val input = readln().split(" ").map{it.toInt()}.toSortedSet()
    val arr = IntArray(m)

    fun bt(cnt: Int){
        if(cnt == m){
            println(arr.joinToString(" "))
            return
        }
        for(i in input){
            if(arr.contains(i)) continue
            arr[cnt] = i
            bt(cnt+1)
            arr[cnt] = 0
        }
    }
    bt(0)
}