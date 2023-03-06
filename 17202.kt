package com.example.alogrithems

/**
 * 2023-03-06
 * pureum
 */

fun main(){
    val first = readln().chunked(1).map { it.toInt() }
    val second = readln().chunked(1).map { it.toInt() }
    var hap = arrayListOf<Int>()
    for(i in first.indices) {
        hap.add(first[i])
        hap.add(second[i])
    }
    while(hap.size != 2 ){
        hap = gate(hap) }
    hap.forEach { print(it) }
}

fun gate(hap:ArrayList<Int>): ArrayList<Int>{
    val newHap = arrayListOf<Int>()
    for(i in 0 until hap.size-1){
        val gap = if(hap[i]+hap[i+1] >= 10) hap[i]+hap[i+1] - 10 else hap[i]+hap[i+1]
        newHap.add(gap)
    }
    return newHap
}