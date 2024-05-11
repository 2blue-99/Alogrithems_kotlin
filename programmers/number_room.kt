package com.blue.algorithem_kotlin.programmers

import java.util.*


fun main() {
//    Number_Room().solution(intArrayOf(2,5,2,7))
//    Number_Room().solution(intArrayOf(2,5))
    Number_Room().solution(intArrayOf(0, 6, 4, 2, 7, 2, 5))
    Number_Room().solution(intArrayOf(6, 4, 2, 0, 6, 4, 2, 0))
//    Number_Room().solution(intArrayOf(6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0))
}

class Number_Room {
    fun solution(arrows: IntArray): Int {
        var answer = 0
        val map = mutableMapOf<Pair<Int, Int>, ArrayList<Pair<Int, Int>>>()
        val visit = mutableMapOf<Pair<Int, Int>, Boolean>()
        val xList = listOf(0, 1, 1, 1, 0, -1, -1, -1)
        val yList = listOf(1, 1, 0, -1, -1, -1, 0, 1)
        var (px, py) = listOf(0,0)
        visit[Pair(0,0)] = true
        for(arrow in arrows){
            repeat(2){
                val x = px + xList[arrow]
                val y = py + yList[arrow]
                if(visit.containsKey(Pair(x,y))) {
                    if(!map.contains(Pair(x,y)) || (map.contains(Pair(x,y)) && !map[Pair(x,y)]!!.contains(Pair(px,py))))
                        answer++
                }
                visit[Pair(x,y)] = true
                val nNode = map.getOrPut(Pair(x,y)){ arrayListOf() }
                val pNode = map.getOrPut(Pair(px,py)){ arrayListOf() }
                nNode.add(Pair(px,py))
                pNode.add(Pair(x,y))
                px = x
                py = y
            }
        }
        println(answer)
        return answer
    }
}