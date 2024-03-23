package com.blue.algorithem_kotlin.backjune

import java.util.*

fun main() {
    while (true) {
        val (mw, mh) = readln().split(" ").map { it.toInt() }
        if (mw == 0 && mh == 0) break
        val map = Array(mh) { IntArray(mw) }
        val queue: Queue<List<Int>> = LinkedList()
        val xl = listOf(-1, -1, -1, 0, 0, 1, 1, 1)
        val yl = listOf(1, 0, -1, 1, -1, 1, 0, -1)
        var cnt = 0
        repeat(mh) {
            map[it] = readln().split(" ").map { it.toInt() }.toIntArray()
        }
        fun bfs() {
            while (queue.isNotEmpty()) {
                val (w, h) = queue.poll()!!
                for (i in 0 until 8) {
                    val x = xl[i]
                    val y = yl[i]
                    if (w + x >= mw || w + x < 0 || h + y >= mh || h + y < 0) continue
                    if (map[h + y][w + x] == 0) continue
                    map[h + y][w + x] = 0
                    queue.add(listOf(w + x, h + y))
                }
            }
        }
        repeat(mh) { h ->
            repeat(mw) { w ->
                if (map[h][w] == 1) {
                    cnt++
                    queue.add(listOf(w, h))
                    bfs()
                }
            }
        }
        println(cnt)
    }
}
