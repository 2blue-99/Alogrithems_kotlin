package com.blue.algorithem_kotlin.programmers

import java.util.*

class Solution {
    fun solution(maps: Array<String>): Int {
        // 레버까지 이동
        // 출구까지 이동
        // BFS
        var answer: Int = 0
        val targetList = listOf('L','E')
        val xList = listOf(0,0,-1,1)
        val yList = listOf(1,-1,0,0)
        var (sr,sc) = listOf(0,0)
        val maxH = maps.size
        val maxW = maps[0].length
        val queue: Queue<Triple<Int,Int,Int>> = LinkedList()

        loop@ for(r in maps.indices){
            for(c in maps[0].indices){
                if(maps[r][c] == 'S'){
                    sr = r
                    sc = c
                    break@loop
                }
            }
        }

        fun bfs(t: Char){
            val visit = Array(maxH){BooleanArray(maxW)}
            while(queue.isNotEmpty()){
                val (x,y,cnt) = queue.poll()
                for(i in 0 until 4){
                    val nx = x + xList[i]
                    val ny = y + yList[i]
                    if(nx<0 || ny<0 || nx >= maxH || ny >= maxW || maps[nx][ny] == 'X' || visit[nx][ny])
                        continue
                    if(maps[nx][ny] == t){
                        sr = nx
                        sc = ny
                        answer += cnt+1
                        queue.clear()
                        return
                    }
                    queue.add(Triple(nx,ny, cnt+1))
                    visit[nx][ny] = true
                }
            }
            answer = -1
        }

        for(target in targetList){
            queue.add(Triple(sr,sc,0))
            bfs(target)
            if(answer == -1) break
        }

        return answer
    }
}