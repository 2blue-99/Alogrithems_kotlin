package com.blue.algorithem_kotlin.programmers

import java.util.LinkedList

class minimum_rectangle {
    fun solution(sizes: Array<IntArray>): Int {
        var w = 0
        var h = 0
        val queue: java.util.Queue<Int> = LinkedList()
        sizes.forEach{ paper ->
            if(paper[0] < paper[1]){
                if(w < paper[0]) w = paper[0]
                if(h < paper[1]) h = paper[1]
            }else{
                if(w < paper[1]) w = paper[1]
                if(h < paper[0]) h = paper[0]
            }
        }
        return w * h
    }
}