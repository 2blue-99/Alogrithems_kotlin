package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-14
 * pureum
 */



fun main(){
    val (maxh, maxw) = readln().split(" ").map { it.toInt() }
    var arr = Array(maxh){ IntArray(maxw) }
    arr.forEachIndexed { index, _ -> arr[index] = readln().split(" ").map { list -> list.toInt() }.toIntArray() }
    var vArr = Array(maxh){ BooleanArray(maxw){false} }
    var max = 0
    var num = 0
    val queue = ArrayDeque<List<Int>>()

    for(h in 0 until maxh){
        for(w in 0 until maxw){
            if(!vArr[h][w] && arr[h][w]==1) {
                var count = 0
                queue.addLast(listOf(h, w, 0))

                while (queue.isNotEmpty()) {
                    var (nh, nw) = queue.removeFirst()
                    if (nh < 0 || nw < 0 || nh >= maxh || nw >= maxw) continue
                    if (vArr[nh][nw]) continue
                    if (arr[nh][nw] == 0) continue
                    vArr[nh][nw] = true
                    count++

                    queue.addLast(listOf(nh + 1, nw))
                    queue.addLast(listOf(nh - 1, nw))
                    queue.addLast(listOf(nh, nw + 1))
                    queue.addLast(listOf(nh, nw - 1))
                }
                if(max<count) max = count
                num ++
            }
        }
    }
    println(num)
    println(max)
}

