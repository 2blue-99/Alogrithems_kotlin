package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-04
 * pureum
 */
var inputArr = arrayOf(intArrayOf())
var visitArr = arrayOf(booleanArrayOf())
var size = 0

fun main(){
    // 0,0에서부터 n,m까지 하나씩 지나감
    // 가다가 0이 아닐경우 bfs로 체크
    // 끝나면 단지 번호와 단지 개수를 맵에다 체크
    size = readln().toInt()
    val map = mutableMapOf<Int, Int>()
    var bg = 1
    inputArr = Array(size){ intArrayOf() }
    visitArr = Array(size){ BooleanArray(size){false} }
    repeat(size){
        inputArr[it] = readln().chunked(1).map { it.toInt() }.toIntArray()
    }

    for(i in inputArr.indices)
        for(k in inputArr.indices)
            if(inputArr[i][k] == 1) {
                map[bg] = bfs(i, k, 0)
                bg++
            }
    println(map.size)
    val dapList = mutableListOf<Int>()
    map.forEach{dapList.add(it.value)}
    dapList.sorted().forEach{println(it)}
}

fun bfs(y: Int, x: Int, count: Int): Int{
    if(y<0 || x<0 || y>=size || x>=size) return 0
    if(inputArr[y][x] == 0) return 0
    if(visitArr[y][x]) return 0
    visitArr[y][x] = true
    inputArr[y][x] = 0
    return 1 + bfs(y+1,x,count) + bfs(y-1,x,count) + bfs(y,x+1,count) + bfs(y,x-1,count)
}
