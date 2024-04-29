package com.blue.algorithem_kotlin.programmers

fun main(){
    Ranking().solution(5, arrayOf(intArrayOf(4,3), intArrayOf(4,2), intArrayOf(3,2), intArrayOf(1,2), intArrayOf(2,5)))
}

class Ranking {
    fun solution(n: Int, results: Array<IntArray>): Int {
        // 인접 리스트 만들기 - win / lose
        // win을 통해 n에게 진m을 파악하고 lose[m]에 접급하여 n이 졌던것들을 추가함
        // win lose의 합이 n-1이 될 때 순위 판단 가능
        var answer = 0
        val winMap = Array(n+1){mutableSetOf<Int>()}
        val loseMap = Array(n+1){mutableSetOf<Int>()}
        val visit = BooleanArray(n+1)

        results.forEach{
            val win = it[0]
            val lose = it[1]
            winMap[win].add(lose)
            loseMap[lose].add(win)
        }

        // winMap.forEach{println(it)}
        // loseMap.forEach{println(it)}

        fun dfs(index: Int, list: ArrayList<Int>): ArrayList<Int> {
            val result = arrayListOf<Int>()
            for(loser in winMap[index]){
                dfs(loser, list).forEach{
                    result.add(it)
                }
            }
            result.forEach {
                winMap[index].add(it)
            }
            result.add(index)
            return result
        }

        winMap.indices.forEach {
            dfs(it, arrayListOf())
        }
        winMap.forEach{println(it)}


        for(i in 1..n){
            val winCount = winMap[i].count()
            val loseCount = loseMap[i].count()
            if(winCount + loseCount == n-1)
                answer++
        }
        return answer
    }
}