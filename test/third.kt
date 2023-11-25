package com.example.alogrithems.test

import com.example.alogrithems.backjune.num

/**
 * 2023-11-25
 * pureum
 */

val gapList = mutableListOf<List<Int>>()
var half = 0
var aa = arrayOf<IntArray>()
fun main(){
    val inputList = arrayOf(
        intArrayOf(1, 2, 3, 4, 5, 6),
        intArrayOf(3, 3, 3, 3, 4, 4),
        intArrayOf(1, 3, 3, 4, 4, 4),
        intArrayOf(1, 1, 4, 4, 5, 5)
    )

    aa = inputList

    half = inputList.size / 2

    val numArr = arrayListOf<Int>()
    for(i in inputList.indices)
        numArr.add(i)

    // 모든 경우의 수 구하기
    for(i in numArr)
        makeList(ArrayList(numArr-i), listOf(i))


    val aArr = arrayListOf<List<Int>>()
    val bArr = arrayListOf<List<Int>>()

    for(list in gapList){
        aArr.add(list)
        bArr.add(numArr - list)
    }
    println(aArr)
    println(bArr)

    repeat(aArr.size){
        repeat(1296){
            repeat()
        }
    }
}

fun makeList(arrayList: ArrayList<Int>, completeList: List<Int>){
    if(completeList.size == half) {
        gapList.add(completeList)
        return
    }

    for(i in arrayList){
        var myList = ArrayList(arrayList)
        myList.remove(i)
        makeList(myList, completeList+i)
    }
    return
}