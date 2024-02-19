package com.blue.algorithem_kotlin.backjune

fun main(){
    val list = mutableListOf<Int>()
    val (n,m) = readln().split(" ").map { it.toInt() }

    fun bt(start: Int){
        if(list.size==m) {
            println(list.joinToString(" "))
            return
        }

        for( i in start..n){
            list.add(i)
            bt(i)
            list.remove(i)
        }
    }
    bt(1)
}