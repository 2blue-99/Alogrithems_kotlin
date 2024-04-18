package com.blue.algorithem_kotlin.programmers

import java.util.*

class equal_two_queue {
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

class equal_two_queue2 {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var answer: Int = -1
        // 한줄에 세우고 slice로 왼쪽으로 한번, 오른쪽으로 한번
        val sum = queue1.sumOf{it}.toLong() + queue2.sumOf{it}.toLong()
        var start = 0
        var end = queue1.size-1
        var cnt = 0
        var queueCombine = queue1 + queue2
        while(true){
            try{
                val sliceA = queueCombine.slice(start..end)
                val sumA = sliceA.sumOf{it}.toLong()
                if(sumA == sum / 2){
                    answer = cnt
                    break
                }else if(sumA > sum / 2){
                    start++
                }else{
                    end++
                }
                cnt++
            }catch(e:Exception){
                break
            }
        }

        start = 0
        end = queue2.size-1
        cnt = 0
        queueCombine = queue2 + queue1
        while(true){
            try{
                val sliceB = queueCombine.slice(start..end)
                val sumB = sliceB.sumOf{it}.toLong()
                if(sumB == sum / 2){
                    if(answer > cnt)
                        answer = cnt
                    break
                }else if(sumB > sum / 2){
                    start++
                }else{
                    end++
                }
                cnt++
            }catch(e:Exception){
                break
            }
        }
        return answer
    }
}