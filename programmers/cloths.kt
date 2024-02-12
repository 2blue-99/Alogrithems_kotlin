package com.example.alogrithems.programmers

import kotlin.time.Duration.Companion.seconds

fun main(){
    val map = mutableMapOf<String, MutableList<String>>()
    val arr = arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear"))
    var sum = 1
    arr.indices.groupBy { arr[it].last() }
        .values.forEach { sum *= (it.size+1) }
    println(sum-1)
}

//class Solution {
//    fun solution(clothes: Array<Array<String>>): Int {
//        val map = mutableMapOf<String, MutableList<String>>()
//        clothes.forEach{
//            if(map[it.last()]==null)  map[it.last()] = mutableListf(it.first())
//            else map[it.last()]!!.add(it.first())
//        }
//        var sum = 1
//        map.toList().map{it.second}.forEach{
//            sum *= (it.size+1)
//        }
//        return sum-1
//    }
//}