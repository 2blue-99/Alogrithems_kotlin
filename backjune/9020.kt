package com.example.alogrithems.backjune

import kotlin.math.sqrt

/**
 * 2023-01-29
 * pureum
 */
fun main(){
    var nums = readln().toInt()

    for(i in 1..nums){
        val gap = readln().toInt()
        val sosuList = arrayListOf<Int>()
        val dapList = arrayListOf<ArrayList<Int>>()

        for(k in 2..gap){ //
            var sosuCount=2
            while(true){
                if(sosuCount>sqrt(k.toDouble())){
                    sosuList.add(k)
                    break
                }else if(k%sosuCount==0) break
                sosuCount++
            }
        }
        for(min in sosuList.slice(0 until sosuList.size)){
            var count=sosuList.lastIndex
            while(count>=0) {
                var max = sosuList[count]
                if (min + max == gap) {
                    dapList.add(arrayListOf(min,max))
                    break
                }
                else count--
            }
        }
        if(dapList.size==1) println("${dapList.first()[0]} ${dapList.first()[1]}")
        else {
            var before = listOf<Int>()
            for (i in dapList) {
                if (i[0] - i[1] > 0) {
                    println("${before[0]} ${before[1]}")
                    break
                }
                before = i
            }
        }
    }
}