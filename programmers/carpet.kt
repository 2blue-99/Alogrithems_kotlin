package com.blue.algorithem_kotlin.programmers

class CarpetSolution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        val whList= mutableListOf<List<Int>>()
        for(h in 1..yellow){
            if(yellow%h!=0) continue
            val w = yellow / h
            if(w<h) break
            whList.add(listOf(w, h))
        }

        for(list in whList){
            val(w,h) = list
            if(w*2 + h*2 + 4 == brown)
                answer = listOf(w+2, h+2).toIntArray()
        }
        return answer
    }
}