package com.example.alogrithems

import android.util.Range

/**
 * 2023-02-26
 * pureum
 */

fun main(){
    val myList = IntArray(10035){i->i+1}
    var num = 1
    while(true){
        if(num == 10000) break
        if(num<10) myList[num+num-1] = -1
        else {
            val nums = num.toString().chunked(1).map { it.toInt() }.sum()
            myList[num+nums-1] = -1
        }
        num++
    }
    myList.forEach { if(it<10001 && it != -1) println("$it ") }
}