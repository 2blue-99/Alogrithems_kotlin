package com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val (n,s) = readln().split(" ").map{ it.toInt() }
    val inputList = readln().split(" ").map { it.toInt() }
    val vArr = Array(n){false}
    val resultList = mutableListOf<List<Int>>()

    fun bt(list: MutableList<Int>){
        if(list.size==0) return

        var minus = false
        var plus = false
        for(i in list){
            if(i>0) minus = true
            if(i<0) plus = true
            if(minus && plus) break
        }
        if(minus && !plus)
            if(list.sum()>s) return
        if(!minus && plus )
            if(list.sum()<s) return

        if(list.sum()==s) {
            resultList.add(list.sorted())
            return
        }
        for(i in 0 until n){
            if(!vArr[i]){
                vArr[i] = true
                val newList = list.toMutableList()
                newList.remove(inputList[i])
                bt(newList)
                vArr[i] = false
            }
        }
    }
    bt(inputList.toMutableList())
    println(resultList.toSet().size)
}