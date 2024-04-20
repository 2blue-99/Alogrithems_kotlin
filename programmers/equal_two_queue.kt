package com.blue.algorithem_kotlin.programmers

import java.util.*


fun main(){
    SolutionAA().solution(intArrayOf(1,2,1,2), intArrayOf(1,10,1,2))
}

class SolutionAA {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var answer: Int = -1
        var cnt = 0
        val queueA: Queue<Int> = LinkedList()
        val queueB: Queue<Int> = LinkedList()
        var sumA = 0
        var sumB = 0
        queue1.forEach{
            sumA+=it
            queueA.add(it)
        }
        queue2.forEach{
            sumB+=it
            queueB.add(it)
        }


        while(cnt < queue1.size * 4){
            if(sumA < sumB){
                val poll = queueB.poll()
                sumA+=poll
                sumB-=poll
                queueA.add(poll)
            }
            else if(sumA > sumB){
                val poll = queueA.poll()
                sumB+=poll
                sumA-=poll
                queueB.add(poll)
            }else{
                answer = cnt
                break
            }
            cnt++
        }

        println(answer)
        return answer
    }
}

class equal_two_queue {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var answer: Int = -1
        val queueA: Queue<Int> = LinkedList()
        val queueB: Queue<Int> = LinkedList()
        var sumA = 0L
        var sumB = 0L
        var cnt = 0
        queue1.forEach{
            sumA += it
            queueA.add(it)
        }
        queue2.forEach{
            sumB += it
            queueB.add(it)
        }

        while(cnt <= queue1.size * 4){

            if(sumA == sumB){
                answer = cnt
                break
            }

            if(sumA > sumB){
                val poll = queueA.poll()
                sumA-= poll
                sumB+= poll
                queueB.add(poll)
            }else if(sumA < sumB){
                val poll = queueB.poll()
                sumB-= poll
                sumA+= poll
                queueA.add(poll)
            }

            cnt++
        }
        return answer
    }
}

class equal_two_queue2 {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        // aueue2 -> queue1 쪽으로 보내면서 원소합/2 보다 크면 queue1 -> quque2 로 보냄
        // queue1 -> queue2 쪽으로 보내면서 원소합/2 보다 크면 queue2 -> queue1 로 보냄
        var answer: Int = -1

        val queueA: Queue<Int> = LinkedList()
        val queueB: Queue<Int> = LinkedList()

        var sum: Long = queue1.sumOf{it}.toLong() + queue2.sumOf{it}.toLong()
        var cnt = 0

        queue1.forEach{queueA.add(it)}
        queue2.forEach{queueB.add(it)}

        queueA.poll()

        while(true){
            val sumA = queueA.sumOf{it}.toLong()
            if(cnt>0 && queueA.toList() == queue1.toList())
                break
            if(sumA >= sum/2){
                if(sumA == sum/2){
                    answer = cnt
                    break
                }
                val pollA = queueA.poll()
                queueB.add(pollA)
            }else{
                val pollB = queueB.poll()
                queueA.add(pollB)
            }
            cnt++
        }

        while(true){
            val sumB = queueB.sumOf{it}.toLong()
            if(cnt>0 && queueB.toList() == queue2.toList())
                break
            if(sumB >= sum/2){
                if(sumB == sum/2){
                    answer = cnt
                    break
                }
                val pollB = queueB.poll()
                queueA.add(pollB)
            }else{
                val pollA = queueA.poll()
                queueB.add(pollA)
            }
            cnt++
        }

        return answer
    }
}