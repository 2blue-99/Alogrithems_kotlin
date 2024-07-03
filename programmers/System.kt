package com.blue.algorithem_kotlin.programmers

import java.util.*

fun main(){
//    println(System().solution(arrayOf(
//        intArrayOf(0, 4),
//        intArrayOf(1, 2),
//        intArrayOf(1, 3),
//        intArrayOf(3, 4),
//    )))
//    println(System().solution(arrayOf(
//        intArrayOf(0, 1),
//        intArrayOf(0, 2),
//        intArrayOf(0, 3),
//        intArrayOf(0, 4),
//        intArrayOf(0, 5)
//    )))
    println(System().solution(arrayOf(
        intArrayOf(4, 5),
        intArrayOf(4, 8),
        intArrayOf(10, 14),
        intArrayOf(11, 13),
        intArrayOf(5, 12),
        intArrayOf(3, 7),
        intArrayOf(1, 4)
    )))
}

class System {
    fun solution(targets: Array<IntArray>): Int {
        var answer: Int = 0
        val sorted = targets.sortedWith(compareBy<IntArray>{it[1]}.thenBy{it[0]})
        var end = sorted[0][1]
        for(target in sorted){
            if(target[0] < end) continue
            end = target[1]
            answer++
        }
        return answer+1
    }
}