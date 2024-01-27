package com.blue.algorithem_kotlin.backjune

import kotlin.math.abs

fun main() {
    // N x N 크기의 체스판에 퀸 N개를 서로 공격 못하게 놓는 경우의 수
    val n = readln().toInt()
    val yArr = IntArray(n)
    var answer = 0

    fun check(y: Int): Boolean {
        for (i in 0 until y) {
            if (yArr[i] == yArr[y] || (y - i == abs(yArr[y] - yArr[i])))
                return false
        }
        return true
    }

    fun dfs(y: Int) {
        if (y == n) {
            answer++
            return
        }
        for (x in 0 until n) {
            yArr[y] = x
            if (check(y)) {
                dfs(y + 1)
            }
        }
        
    }
    dfs(0)
    println(answer)
}


//fun main() {
//    // N x N 크기의 체스판에 퀸 N개를 서로 공격 못하게 놓는 경우의 수
//    val n = readln().toInt()
//    val map = Array(n){IntArray(n)}
//    val vhArr = BooleanArray(n)
//    val vwArr = BooleanArray(n)
//    val queen = mutableListOf<List<Int>>()
//    var answer = 0
//
//    fun check(h:Int, w:Int): Boolean{
//        for( i in queen){
//            val qh = i.first()
//            val qw = i.last()
//            repeat(n-1){
//                if(h+1 == qh && w+1 == qw) return false
//                if(h-1 == qh && w-1 == qw) return false
//                if(h+1 == qh && w-1 == qw) return false
//                if(h-1 == qh && w+1 == qw) return false
//            }
//        }
//        return true
//    }
//
//    fun dfs(cnt: Int, start: Int){
//        if(cnt == n){
//            println(queen)
//            answer++
//            return
//        }
//        for(h in start until n){
//            if(vhArr[h]) continue
//            for(w in 0 until n){
//                if(vwArr[w]) continue
//                if(map[h][w] == 0 && check(h,w)) {
//                    vhArr[h] = true
//                    vwArr[w] = true
//                    queen.add(listOf(h,w))
//                    dfs(cnt + 1, h+1)
//                    queen.remove(listOf(h,w))
//                    vhArr[h] = false
//                    vwArr[w] = false
//                }
//            }
//        }
//    }
//    dfs(0,0)
//    println(answer)
//}