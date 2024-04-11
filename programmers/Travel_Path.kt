package com.blue.algorithem_kotlin.programmers

import com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune.visitArr

//["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]
fun main(){
    Solution222().solution(arrayOf(arrayOf("ICN", "JFK"), arrayOf("JFK", "ICN"), arrayOf("ICN", "JFK")))
}

class Solution222 {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val visit = BooleanArray(tickets.size)
        val result = mutableListOf<List<String>>()

        fun dfs(list: MutableList<String>){
            if(visit.filter { it }.size == tickets.size){
                result.add(list.toList())
                println(result)
                return
            }
            for((index, ticket) in tickets.withIndex()){
                if(visit[index]) continue
                if(ticket.first() == list.last()){
                    visit[index] = true
                    val nl = list.toMutableList()
                    nl.add(ticket.last())
//                    list.add(ticket.last())
                    dfs(nl)
                    visit[index] = false
                }
            }
        }

        tickets.forEachIndexed{ index, ticket ->
            if(ticket.first() == "ICN") {
                visit[index] = true
                dfs(mutableListOf("ICN",ticket.last()))
                visit[index] = false
            }
        }

        return result.sortedBy{ it.joinToString("") }.first().toTypedArray()
    }
}