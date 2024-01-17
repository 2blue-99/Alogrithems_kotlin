package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-11-30
 * pureum
 */

fun main(){
    // 방사이즈 N, M
    // 로봇청소기 위치 r,c (위에서 r+1, 왼족에서 c+1 위치를 의미) , 바라보는 방향 d (d가 0인경우 북쪽, 1인 경우 동쪽, 2인 경우 남쪽, 3인경우 서쪽)
    // 0 : 청소되지 않은 빈칸
    // 1 : 벽이 존재
    // 동서남북 끝쪽에는 벽 존재
    // 로봇청소기가 있는 칸은 빈칸

    // 1 현재칸 청소 안되면 청소
    // 2 현재칸 주변 4칸(동서남북)이 청소됐다면
    //   1. 바라보는 방향 유지, 한칸 후진
    //   2. 바라보는 방향 뒤쪽이 벽이라 후진못한다면 작동 멈춤
    // 3 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 있는 경우
    //   1. 반시계 90' 회전함
    //   2. 바라보는 방향 기준 앞이 청소안된 빈칸일 경우 한칸 전진
    //   3. 1번으로 돌아감

    var count = 0
    // 높이 : n, 너비 : m
    val (n,m) = readln().split(" ").map { it.toInt() }
    //
    var (r,c,d) = readln().split(" ").map { it.toInt() }
    val arr = Array(n){ IntArray(m) }
    repeat(n){ n ->
        arr[n] = readln().split(" ").map { it.toInt() }.toIntArray()
    }
    val list = listOf(listOf(0,1),listOf(0,-1),listOf(1,0),listOf(-1,0))
    val queue = ArrayDeque<List<Int>>()
    queue.addLast(listOf(r,c))

    while (queue.isNotEmpty()){
        val (y,x) = queue.removeFirst()

        // 현재 칸 청소
        if(arr[y][x] == 0) {
            arr[y][x] = 3
            count++
        }
        // 동서남북의 청소유무 확인
        var clear = true
        for((b,a) in list){
            val gap = arr[y+b][x+a]
            if(gap == 0){
                clear = false
                break
            }
        }
        // 동서남북 청소가 되어있을 경우,
        if(clear){
            // 방향에 따른 후진 위치 결정
            val (ny, nx) = when(d) {
                0 -> listOf(y+1, x)
                1 -> listOf(y, x-1)
                2 -> listOf(y-1, x)
                else -> listOf(y, x+1)
            }
            // 다음 위치가 벽인지 체크
            if(arr[ny][nx] == 1) break
            queue.addLast(listOf(ny,nx))
            continue
        }

        // 동서남북 청소가 안되었을 경우, 90도 회전 및 다음 위치 결정
        val (ny, nx) = when(d) {
            0 -> { // 북쪽
                d = 3 //서쪽
                listOf(y, x-1)
            }
            1 -> { //동쪽
                d = 0 //북쪽
                listOf(y-1, x)
            }
            2 -> { // 남쪽
                d = 1 //동쪽
                listOf(y, x+1)
            }
            else -> { //서족
                d = 2 //남쪽
                listOf(y+1, x)
            }
        }
        // 다음 위치가 청소 안되어 있는지 체크
        if(arr[ny][nx] != 0) {
            queue.addLast(listOf(y,x))
            continue
        }
        queue.addLast(listOf(ny,nx))
    }
    println(count)
}
