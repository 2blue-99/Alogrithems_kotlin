package com.blue.algorithem_kotlin.programmers

fun main(){
//    val gap = Test().solution(intArrayOf(1,2,3,4,5))
    val gap = Test().solution(intArrayOf(1,3,2,4,2))
    println(gap.contentToString())
}

class Test {
    fun solution(answers: IntArray): IntArray {
        var answerList = arrayListOf<Int>()
        val list = arrayOf(listOf(1,2,3,4,5), listOf(2,1,2,3,2,4,2,5), listOf(3,3,1,1,2,2,4,4,5,5))
        list.forEach{ pickList ->
            var idx = 0
            var cnt = 0
            while(idx<answers.size) {
                for (i in pickList) {
                    if (idx == answers.size)
                        break
                    if (i == answers[idx])
                        cnt++
                    idx++
                }
            }
            answerList.add(cnt)
        }
        return answerList.indices.filter { answerList[it]==answerList.maxOf{it} }.map { it+1 }.toIntArray()
    }
}