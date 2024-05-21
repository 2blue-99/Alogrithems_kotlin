package com.blue.algorithem_kotlin.programmers

import java.util.*


fun main() {
//    Number_Room().solution(intArrayOf(0, 6, 4, 2, 7, 2, 5))
    Number_Room2().solution(intArrayOf(2,5,2,7))
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

class Number_Room2 {
    fun solution(arrows: IntArray): Int {
        // 만났을 때 && 간선 정보가 없을 때 &&
        var answer = 0
        var xList = listOf(0,1,1,1,0,-1,-1,-1)
        var yList = listOf(-1,-1,0,1,1,1,0,-1)
        var (px, py) = listOf(0,0)
        var map = mutableMapOf<Pair<Int,Int>, MutableSet<Pair<Int, Int>>>()


        arrows.forEach {
            repeat(2){ _ ->
                val nx = px+xList[it]
                val ny = py+yList[it]
                if(map.contains(Pair(nx, ny)))
                    if (!map[Pair(nx, ny)]!!.contains(Pair(px, py)))
                        answer++

                map.getOrPut(Pair(nx, ny)){mutableSetOf()}.add(Pair(px, py))
                map.getOrPut(Pair(px, py)){mutableSetOf()}.add(Pair(nx, ny))

                px = nx
                py = ny
            }
        }
        return answer
    }
}