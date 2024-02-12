package com.example.alogrithems.programmers

/**
 * 2023-12-06
 * pureum
 */
fun main(){
    Solution2().solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log", "cog"))
    //"hot", "dot", "dog", "lot", "log", "cog"
    // "hot", "dot", "dog", "lot", "log"
}
class Solution2 {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        var start = begin
        var arr = words.copyOf() //
        var visitArr = BooleanArray(arr.size) //
        var queue = ArrayDeque<Pair<String,Int>>() //
        var answer = 0

        queue.addLast(Pair(start, 0))

        while(queue.isNotEmpty()){

            val pop = queue.removeFirst()
            val myWord = pop.first
            val wordList = pop.first.chunked(1) //
            val count = pop.second

            if(myWord == target){
                answer = count
                break
            }

            for((wIndex,word) in arr.withIndex()){
                if(check(wordList, word) && !visitArr[wIndex]){
                    queue.addLast(Pair(word, count+1))
                    visitArr[wIndex] = true
                }
            }
        }
        println(answer)
        return answer
    }

    fun check(list: List<String>, word: String): Boolean{
        var check = 0
        for((aIndex,alpha) in word.chunked(1).withIndex()){
            if(alpha != list[aIndex]) check++
            if(check>1) return false
        }
        return true
    }
}