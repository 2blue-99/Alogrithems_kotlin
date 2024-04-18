package com.blue.algorithem_kotlin.programmers

class dictionary {
    fun solution(word: String): Int {
        var answer = -1
        var find = false
        val list = listOf("A","E","I","O","U").slice(1-1 until 1)
        val arr = arrayOf(1,2,3).toMutableList()
        val a: BooleanArray
        fun bt(w: String){
            answer++
            if(w == word){
                find = true
                return
            }
            for(i in list){
                if(find) return
                val str = w+i
                if(5 < str.length) return
                bt(str)
            }
        }
        bt("")
        return answer
    }
}