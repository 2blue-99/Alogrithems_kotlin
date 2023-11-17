package com.example.alogrithems.backjune

/**
 * 2023-07-25
 * pureum
 */

//fun main(){
//    val array = Array(50) { mutableSetOf<String>() }
//    repeat(readln().toInt()){
//        val gap = readln()
//        array[gap.length-1].add(gap)
//    }
//    for(i in array){
//        i.sorted().forEach { println(it) }
//    }
//}

fun main(){
    var mySet = mutableSetOf<String>()
    var mySet2 = hashSetOf<String>()
    var mySet3 = setOf<String>()
    var mySet4 = sortedSetOf<String>()
    var num = readln().toInt()
    repeat(num){
        mySet.add(readln())
    }
    var newList = mutableListOf<List<String>>()
//    var myList = mySet.sortedBy { it.length }
    mySet.forEach { newList.add(it.chunked(1)) }


    newList.sortedBy { it[0] }.forEach { println(it) }
    newList.sortedBy { it[1] }.forEach { println(it) }


}











