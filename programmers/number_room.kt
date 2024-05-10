package com.blue.algorithem_kotlin.programmers

import java.util.*
import kotlin.math.*


fun main() {
    Number_Room().solution(intArrayOf(6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0))
}

class Number_Room {
    fun solution(arrows: IntArray): Int {
        // 1. 최대 가로와 최대 세로를 구함
        // 2. 크기에 딱 맞는 arr에 그려놓음
        // 3. bfs로 외각을 돌면서 해당안되는 부분 제거 + 내부일 경우 cnt++
        var answer = 0
        var (curW, curH) = listOf(0, 0)
        var (maxW, minW) = listOf(0, 0)
        var (maxH, minH) = listOf(0, 0)
        val xList = listOf(0, 1, -1, 0)
        val yList = listOf(1, 0, 0, -1)
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        arrows.forEach {
            when (it) {
                0 -> {
                    curH++
                    if (maxH < curH) maxW = curH
                }

                1 -> {
                    curW++
                    curH++
                    if (maxH < curH) maxH = curH
                    if (maxW < curW) maxW = curW
                }

                2 -> {
                    curW++
                    if (maxW < curW) maxW = curW
                }

                3 -> {
                    curH--
                    curW++
                    if (minH > curH) minH = curH
                    if (maxW < curW) maxW = curW
                }

                4 -> {
                    curH--
                    if (minH > curH) minH = curH
                }

                5 -> {
                    curH--
                    curW--
                    if (minH > curH) minH = curH
                    if (minW > curW) minW = curW
                }

                6 -> {
                    curW--
                    if (minW > curW) minW = curW
                }

                7 -> {
                    curH++
                    curW--
                    if (maxH < curH) maxH = curH
                    if (minW > curW) minW = curW
                }
            }
        }
        val width = (maxW + abs(minW)) * 3
        val height = (maxH + abs(minH)) * 3
        var arr = Array(height*2) { IntArray(width*2) }
        var (curY, curX) = listOf(maxH * 3+1, abs(minW) * 3+1)
        arr[curY][curX] = 1
        arrows.forEach {
            when (it) {
                0 -> {
                    repeat(3) {
                        curY--
                        arr[curY][curX] = 1
                    }
                }

                4 -> {
                    repeat(3) {
                        curY++
                        arr[curY][curX] = 1
                    }
                }

                1, 2, 3 -> {
                    repeat(3) { index ->
                        curX++
                        if (it == 1) curY--
                        if (it == 3) curY++
                        arr[curY][curX] = 1
                    }
                }

                5, 6, 7 -> {
                    repeat(3) { index ->
                        curX--
                        if (it == 7) curY--
                        if (it == 5) curY++
                        arr[curY][curX] = 1
                    }
                }
            }
        }


        fun bfs() {
            while (queue.isNotEmpty()) {
                val (qx, qy) = queue.poll()
                for (i in 0..3) {
                    val x = qx + xList[i]
                    val y = qy + yList[i]
                    if (x < 0 || x == width || y < 0 || y == height) continue
                    if (arr[x][y]==1) continue
                    arr[x][y] = 1
                    queue.add(Pair(x, y))
                }
            }
        }
        for (y in 0 until height) {
            for (x in 0 until width) {
                if (arr[y][x] == 0) {
                    answer++
                    if (x == 0 || x == width - 1 || y == 0 || y == height - 1)
                        answer--
                    queue.add(Pair(y, x))
                    bfs()
                }
            }
        }
        return answer
    }
}