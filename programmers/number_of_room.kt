package com.blue.algorithem_kotlin.programmers

import java.util.*
import kotlin.math.abs

fun main(){
    val gap = number_of_room().solution(intArrayOf(6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0))
    println(gap - 1)
}

class number_of_room {
    fun solution(arrows: IntArray): Int {
        var answer = 0
        var arr = Array(100_010){BooleanArray(100_010)}
        val xList = listOf(0, 1, 1, 1, 0, -1, -1, -1)
        val yList = listOf(1, 1, 0, -1, -1, -1, 0, -1)
        var (px, py) = listOf(50_00, 50_00)
        val queue: Queue<Pair<Int,Int>> = LinkedList()


        abs(1)

        var n = 1
        when(n){
            1,2,3 -> {}
            5 -> {}
        }

        arr[px][py] = true

        arrows.forEach{
            repeat(3){
                px += xList[it]
                py += yList[it]
                arr[px][py] = true
            }
        }

        fun bfs(){
            while(queue.isNotEmpty()){
                val (qx,qy) = queue.poll()
                println("$qx, $qy")
                for(i in 0..7){
                    val x = qx + xList[i]
                    val y = qy + yList[i]
                    if(x < 0 || x >= 100_01 || y < 0 || y >= 100_01)
                        continue
                    if(arr[x][y])
                        continue
                    queue.add(Pair(x,y))
                }
            }
        }

        for(y in arr.indices){
            for(x in arr.indices){
                if(!arr[y][x]){
                    answer++
                    queue.add(Pair(y,x))
                    bfs()
                }
            }
        }
        return answer
    }
}