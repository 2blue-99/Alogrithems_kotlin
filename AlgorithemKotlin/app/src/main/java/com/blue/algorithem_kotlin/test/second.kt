package com.example.alogrithems.test

/**
 * 2023-11-25
 * pureum
 */
    val edgArr = arrayListOf(
    intArrayOf(4, 11),
    intArrayOf(1, 12),
    intArrayOf(8, 3),
    intArrayOf(12, 7),
    intArrayOf(4, 2),
    intArrayOf(7, 11),
    intArrayOf(4, 8),
    intArrayOf(9, 6),
    intArrayOf(10, 11),
    intArrayOf(6, 10),
    intArrayOf(3, 5),
    intArrayOf(11, 1),
    intArrayOf(5, 3),
    intArrayOf(11, 9),
    intArrayOf(3, 8)
    )

val myArr = Array<MutableList<Int>>(20){ mutableListOf() }
//val edgArr = arrayListOf(intArrayOf(2, 3), intArrayOf(4, 3), intArrayOf(1, 1), intArrayOf(2, 1))
var donut = 0
var stick = 0
var eight  = 0
var mainDot = 0

fun main(){


    // 정점 구하기
    var max = 0
    var min = 0
    val mainDotIndex = arrayListOf<Int>()


    for( list in edgArr){
        val first = list.first()
        val second = list.last()
        val big = java.lang.Integer.max(first,second)
        val small = java.lang.Integer.min(first,second)
        if(max < big) max = big
        if(min > small) min = small
        if(first == second) continue
        myArr[first].add(first)
        myArr[second].add(first)
    }

    for(gap in min until max){
        val list = myArr[gap]
        for(num in list){
            if(list.count{it==num} == list.size) {
                mainDot = gap
                break
            }
        }
    }

    // 정점에서 시작하는거 가려내기
    for((index,list) in edgArr.withIndex()){
        val (from, to) = list
        if(from == mainDot)
            mainDotIndex.add(index)
    }

    val newEdg = ArrayList<IntArray>()
    newEdg.addAll(edgArr)
    for(index in mainDotIndex){
        val list = newEdg[index]
        edgArr.remove(list)
        dfs(list.first(), list.last(), mutableListOf())
    }
    println("$mainDot, $donut, $stick, $eight")
}

fun dfs(from:Int, to:Int, record: MutableList<Int>){


    var findArr = intArrayOf()
    var next = -1
    for(arr in edgArr){
        if(arr.first() == to){
            next = arr.last()
            findArr = arr
            edgArr.remove(arr)
            break
        }
        if(from == mainDot && arr.last() == to) {
            dfs(arr.first(), arr.last(), record)
            return
        }
    }
    record.add(to)

    //탈출

    if(findArr.contentEquals(intArrayOf())) {
        val setRecord = record.toSet()
        if(record.size > 2 && setRecord.size < record.size-1)
            eight++
        else if(record.size == 1 || record.size == setRecord.size)
            stick++
        else
            donut++
        return
    }
    // 재귀
    dfs(to, next, record)
}



//
//    myQueue.addLast(intArrayOf(1))
//    val gap = myQueue.removeFirst()
//    println(gap.contentToString())