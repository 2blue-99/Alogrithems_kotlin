package com.blue.algorithem_kotlin.programmers

class K_Number {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        commands.forEach{
            var (i,j,k) = it.toList().map{it.toInt()}
            answer.add(array.slice(i-1..j-1).sorted()[k-1])
        }
        return answer.toIntArray()
    }
}