package com.blue.algorithem_kotlin.backjune

fun main(){
    // 나이트는 다음 규칙으로 이동할 수 있음
    // 나이트가 이동하려는 칸이 주어질 때, 주어진 칸 까지 도달하는 최소 이동 횟수를 출력
    // 너비 우선탐색으로 구현.
    repeat(readln().toInt()) {
        val size = readln().toInt()
        val (nh, nw) = readln().split(" ").map { it.toInt() }
        val (th, tw) = readln().split(" ").map { it.toInt() }

        val arr = Array(size) { IntArray(size) }
        val vArr = Array(size) { BooleanArray(size) }

        val queue = ArrayDeque<List<Int>>()

        val xList = listOf(-2, -1, 2, 1)
        val yList = listOf(-1, -2, 1, 2)

        queue.addLast(listOf(nh, nw, 0))

        while (queue.isNotEmpty()) {
            val (h, w, cnt) = queue.removeFirst()

            if (h < 0 || w < 0 || h >= size || w >= size) continue
            if (vArr[h][w]) continue

            vArr[h][w] = true
            arr[h][w] = cnt

            if (h == th && w == tw) {
                println(cnt)
                break
            }
            for (i in 0 until 4) {
                queue.addLast(listOf(h + yList[i], w + xList[i], cnt + 1))
                queue.addLast(listOf(h + yList[i], w - xList[i], cnt + 1))
            }
        }
    }
}