package com.blue.algorithem_kotlin.programmers

import java.util.*

class furthest_node {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        val gArr = Array(n+1){mutableListOf<Int>()}
        val vArr = BooleanArray(n+1)
        val queue: Queue<Pair<Int,Int>> = LinkedList()
        var maxDepth = 0
        var answer = 0

        for((index, i) in edge.withIndex()){
            gArr[i[1]].add(i[0])
            gArr[i[0]].add(i[1])
        }

        vArr[1] = true
        queue.add(Pair(1, 1))

        while(queue.isNotEmpty()){
            val (depth, node) = queue.poll()
            if(maxDepth < depth) {
                maxDepth = depth
                answer = 1
            }
            else
                answer++
            for(i in gArr[node]){
                if(vArr[i]) continue
                vArr[i] = true
                queue.add(Pair(depth+1, i))
            }
        }
        return answer
    }
}