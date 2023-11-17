package com.example.alogrithems.programmers

import java.util.LinkedList

/**
 * 2023-11-14
 * pureum
 */
private lateinit var intArr : IntArray
private var target : Int = 0
private var myCount = 0
private var pureumCount = 0
fun main(){

    val map = mutableListOf(
        mutableListOf(1,0,1,1,1),
        mutableListOf(1,0,1,0,1),
        mutableListOf(1,0,1,0,1),
        mutableListOf(1,1,1,1,1),
        mutableListOf(0,0,0,0,1))

    var queue = LinkedList<MutableList<Int>>()
    var maxH = map.size
    var maxW = map[0].size


    queue.add(mutableListOf(0,0))

    val hList = listOf(-1,0,0,1)
    val wList = listOf(0,1,-1,0)

    loop@while(true){
        if(queue.isEmpty()) break
        val (x,y) = queue.pollFirst()

        for(i in 0..3){
            var nH = x + hList[i]
            var nW = y + wList[i]

            // 맵 밖으로 벗어나는 경우.
            if(nH >= maxH || nW >= maxW || nH<0 || nW<0)
                continue

            // 벽이 아닌, 처음 지나가는 경우 .
            if(map[nH][nW] == 1) {
                map[nH][nW] = map[x][y] + 1

                if(nH+1 == maxH && nW+1 == maxW)
                    break@loop
                queue.add(mutableListOf(nH, nW))
            }
        }
    }

    println(map.forEach { println(it) })
    if(map[maxH-1][maxW-1]==1)
        println(-1)
    else
        println(map[maxH-1][maxW-1])

































//    val maxX = map[0].size
//    val maxY = map.size
//    val dx = listOf(-1, 0, 0, 1)
//    val dy = listOf(0, -1, 1, 0)
//
//    var nx:Int
//    var ny:Int
//
//    while (true){
//        if(queue.isEmpty()) break
//
//        val pop = queue.pollFirst()
//        var x = pop[0] //0
//        var y = pop[1]  // 1
//
////        (-1, 0, 0, 1)
////        (0, -1, 1, 0)
//        for(i in 0..3){
//            nx = x + dx[i] // 0
//            ny = y + dy[i] // 1
//
//            //맵 벗어날때
//            if(nx<0 || ny<0 || nx>=maxX || ny>=maxY) continue
//
//            // 벽을 마주쳤을 때
//            if(map[nx][ny] == 0) continue
//
//            // 길일 때
//            if(map[nx][ny] == 1) {
//                    //0 1         0,0
//                map[nx][ny] = map[x][y] + 1
//                queue.add(listOf(nx, ny))
//            }
//        }
//        println(queue)
//
//    }
//
//    println(if(map[maxX-1][maxY-1]==1) -1 else map[maxX-1][maxY-1] )
//    println(map.forEach { println(it) })
}
