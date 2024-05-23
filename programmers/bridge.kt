package com.blue.algorithem_kotlin.programmers
import java.util.*

fun main(){
//    val gap = Bridge().solution(2, 10, intArrayOf(7,4,5,6))
    val gap = Bridge().solution(100, 10, intArrayOf(7,4,5,6))
    println(gap)
}
class Bridge {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        // 대기 큐 만들기
        // 다리 큐 만들기
        // 다리 큐에 자리가 있을경우 + 무게가 허용될 경우 대기큐에서 하나 꺼내어 다리 큐에 넣음 (무게, 현재 위치)
        // 다리 큐의 첫번째 길이가 유효하다면 poll
        // 두 개의 큐가 빈다면 종료
        val waitingQ: Queue<Int> = LinkedList()
        val bridgeL = mutableListOf<Pair<Int, Int>>()
        var ableWeight = weight
        var time = 0

        truck_weights.forEach{
            waitingQ.add(it)
        }

        while(waitingQ.isNotEmpty() || bridgeL.isNotEmpty()){
            time++
            for(i in bridgeL.indices){
                val (w,s) = bridgeL[i]
                bridgeL[i] =  Pair(w, s+1)
            }

            if(bridgeL.isNotEmpty()){
                val (weight, length) = bridgeL.first()
                if(length > bridge_length){
                    bridgeL.removeFirst()
                    ableWeight += weight
                }
            }
            if(waitingQ.isNotEmpty()){
                val truckWeight = waitingQ.peek()
                if(truckWeight <= ableWeight){
                    waitingQ.poll()
                    ableWeight -= truckWeight
                    bridgeL.add(Pair(truckWeight, 1))
                }
            }
        }
        return time
    }
}