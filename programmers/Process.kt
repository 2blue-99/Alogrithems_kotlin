package com.blue.algorithem_kotlin.programmers

import java.util.*
fun main(){
//    Process().solution(intArrayOf(2, 1, 3, 2), 2)
    Process().solution(intArrayOf(1, 1, 9, 1, 1, 1), 0)
}
class Process {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var queue: Queue<Pair<Int,Boolean>> = LinkedList()
        var sortedList = priorities.sortedDescending().toMutableList()
        priorities.forEachIndexed { index, i ->
            queue.add(Pair(i, index == location))
        }
        while(queue.isNotEmpty()){
            val (priority, want) = queue.poll()
            if(priority == sortedList.first()){
                sortedList.removeFirst()
                answer++
                if(want) break
            }else{
                queue.add(Pair(priority, want))
            }
        }
        println(answer)
        return answer
    }
}