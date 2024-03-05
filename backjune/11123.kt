package com.blue.algorithem_kotlin.backjune

import java.util.*
fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (mh, mw) = readln().split(" ").map { it.toInt() }
        val arr = Array(mh) { listOf<Char>() }
        val vArr = Array(mh) { BooleanArray(mw) }
        val dh = intArrayOf(-1,1,0,0)
        val dw = intArrayOf(0,0,-1,1)
        var cnt = 0

        repeat(mh) {
            arr[it] = readln().toList()
        }

        val queue: Queue<List<Int>> = LinkedList()

        for (i in 0 until mh) {
            for (j in 0 until mw) {
                if (arr[i][j] == '#' && !vArr[i][j]) {
                    queue.add(listOf(i, j))

                    while (queue.isNotEmpty()) {
                        val (h, w) = queue.remove()
                        vArr[h][w] = true

                        for(i in 0 until 4){
                            val nh = h + dh[i]
                            val nw = w + dw[i]

                            if (nh >= mh || nh < 0 || nw >= mw || nw < 0) continue
                            if (arr[nh][nw] == '.') continue
                            if (vArr[nh][nw]) continue

                            vArr[nh][nw] = true

                            queue.add(listOf(nh, nw))
                        }
                    }
                    cnt++
                }
            }
        }
        println(cnt)
    }
}

//fun main() {
//    val n = readln().toInt()
//    repeat(n) {
//        val (mh, mw) = readln().split(" ").map { it.toInt() }
//        val arr = Array(mh) { listOf<Char>() }
//        val vArr = Array(mh) { BooleanArray(mw) }
//        var cnt = 0
//
//        repeat(mh) {
//            arr[it] = readln().toList()
//        }
//
//        val queue: java.util.Queue<List<Int>> = java.util.LinkedList()
//
//        for (i in 0 until mh) {
//            for (j in 0 until mw) {
//                if (arr[i][j] == '#' && !vArr[i][j]) {
//                    queue.add(listOf(i, j))
//
//                    while (queue.isNotEmpty()) {
//                        val (h, w) = queue.remove()
//                        if (h >= mh || h < 0 || w >= mw || w < 0) continue
//                        if (vArr[h][w]) continue
//                        if (arr[h][w] == '.') continue
//                        vArr[h][w] = true
//
//                        queue.add(listOf(h + 1, w))
//                        queue.add(listOf(h - 1, w))
//                        queue.add(listOf(h, w + 1))
//                        queue.add(listOf(h, w - 1))
//                    }
//
//                    cnt++
//                }
//            }
//        }
//        println(cnt)
//    }
//}

//fun main() {
//    val n = readln().toInt()
//    repeat(n) {
//        val (mh, mw) = readln().split(" ").map { it.toInt() }
//        val arr = Array(mh) { listOf<Char>() }
//        val vArr = Array(mh) { BooleanArray(mw) }
//        var cnt = 0
//
//        repeat(mh) {
//            arr[it] = readln().toList()
//        }
//
//        val queue = ArrayDeque<List<Int>>()
//
//        fun bfs(){
//            while (queue.isNotEmpty()) {
//                val (h, w) = queue.removeLast()
//                if (h >= mh || h < 0 || w >= mw || w < 0) continue
//                if (vArr[h][w]) continue
//                if (arr[h][w] == '.') continue
//                vArr[h][w] = true
//
//                queue.addFirst(listOf(h + 1, w))
//                queue.addFirst(listOf(h - 1, w))
//                queue.addFirst(listOf(h, w + 1))
//                queue.addFirst(listOf(h, w - 1))
//            }
//        }
//        for (i in 0 until mh) {
//            for (j in 0 until mw) {
//                if (arr[i][j] == '#' && !vArr[i][j]) {
//                    queue.addFirst(listOf(i, j))
//                    bfs()
//                    cnt++
//                }
//            }
//        }
//        println(cnt)
//    }
//}