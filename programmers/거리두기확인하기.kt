package com.example.alogrithems.programmers

/**
 * 2023-11-17
 * pureum
 */

fun main(){
    Solution().solution(
        arrayOf(
            arrayOf("POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"),
            arrayOf("POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"),
            arrayOf("PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"),
            arrayOf("OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"),
            arrayOf("PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP")
    )
    )
}

class Solution {

    private var mapArr = Array(5) {""}
    private var inviteArr = Array(5) {Array(5){false}}
    private var p = false

    fun solution(places: Array<Array<String>>): IntArray {
        var answer = ArrayList<Int>()
        for(i in 0..4){
            p = false
            mapArr = places[i]
            roop@ for(h in 0..4){
                for(w in 0..4){
                    if(mapArr[h][w].toString() == "P"){
                        dfs(h,w,0)
                        inviteArr = Array(5) {Array(5){false}}
                        if(p){
                            break@roop
                        }
                    }
                }
            }
            if(p){
                answer.add(0)
            }else{
                answer.add(1)
            }
        }
        println(answer)
        return answer.toIntArray()
    }

    fun dfs(h: Int, w: Int, manhattan:Int){
        println("$h,$w,$manhattan")
        if(h<0 || w<0 || h>=5 || w>=5 || p==true) return
        if(manhattan > 2) return
        if(inviteArr[h][w] == true) return
        if(mapArr[h][w].toString() == "X") return
        if(manhattan != 0 && mapArr[h][w].toString() == "P"){
            p = true
            return
        }
        inviteArr[h][w] = true
        dfs(h-1,w,manhattan+1)
        dfs(h+1,w,manhattan+1)
        dfs(h,w+1,manhattan+1)
        dfs(h,w-1,manhattan+1)
    }
}