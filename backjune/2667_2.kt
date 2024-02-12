package com.blue.algorithem_kotlin.backjune

fun main(){
    //지도를 보고 단지 수 출력 + 단지 수를 오름차순 정렬

    val n = readln().toInt()
    val arr = Array(n){ readln().chunked(1).map { it.toInt() }.toIntArray() }
    val queue = ArrayDeque<List<Int>>()
    val result = mutableListOf<Int>()

    fun bfs(){
        var cnt = 0
        while(queue.isNotEmpty()){
            val (h,w) = queue.removeLast()
            if(w<0 || h<0 || w>=n || h>=n) continue
            if(arr[h][w]==0) continue
            arr[h][w] = 0
            cnt++
            queue.addLast(listOf(h,w+1))
            queue.addLast(listOf(h,w-1))
            queue.addLast(listOf(h+1,w))
            queue.addLast(listOf(h-1,w))
        }
        result.add(cnt)
    }

    repeat(n){h ->
        repeat(n){w ->
            if(arr[h][w] == 1) {
                queue.addLast(listOf(h, w))
                bfs()
            }
        }
    }
    println(result.size)
    result.sorted().forEach { println(it) }
}