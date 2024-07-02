package com.blue.algorithem_kotlin.programmers

fun main(){
    Good_Soft().solution(arrayOf(intArrayOf(1,3), intArrayOf(3,1), intArrayOf(3,5), intArrayOf(2,5), intArrayOf(5,3)))
}

class Good_Soft {
    fun solution(p: Array<IntArray>): Int {
        var answer: Int = 0
        val origin = p.map{it.toList()}
        val new = p.map{it.reversed()}
        val zip = origin + new
        val originSize = zip.size
        val resultSize = zip.toSet().size
        answer = originSize - resultSize


        return answer
    }
}