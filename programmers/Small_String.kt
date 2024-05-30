package com.blue.algorithem_kotlin.programmers

fun main(){
    Small_String().solution("","")
}

class Small_String {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val size = p.length
        var start = 0
        while(true){
            val gap = t.slice(start until start+size)
            if(gap.toInt() <= p.toInt())
                answer++
            start++
            if(start+size > t.length) break
        }
        return answer
    }
}