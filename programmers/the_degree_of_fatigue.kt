package com.example.alogrithems.programmers

class Solution3 {

    var max = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {

        dfs(k, dungeons.toMutableList(), 0)
        return max
    }

    fun dfs(k: Int, dungeons: MutableList<IntArray>, count: Int){
        if(dungeons.isEmpty()) {
            if(max < count) max = count
            return
        }

        for((index,i) in dungeons.withIndex()){
            val needHp = i.first()
            val minusHp = i.last()
            if(k >= needHp){
                val copy = dungeons.toMutableList()
                copy.removeAt(index)
                dfs(k-minusHp, copy, count+1)
            }else{
                if(max < count) max = count
            }
        }
    }
}