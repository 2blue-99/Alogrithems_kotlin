package com.blue.algorithem_kotlin.programmers

fun main(){
    Feature().solution(progresses = intArrayOf(93,30,55), speeds = intArrayOf(1,30,5))
//    Feature().solution(progresses = intArrayOf(95, 90, 99, 99, 80, 99), speeds = intArrayOf(1, 1, 1, 1, 1, 1))
}

class Feature {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var temp = 0
        var startIndex = 0
        val answer = arrayListOf<Int>()

        while(startIndex < progresses.size){
            for(i in progresses.indices){
                if(progresses[i] < 100){
                    progresses[i] += speeds[i]
                }
            }

            if(progresses[startIndex] >= 100){
                // 마지막 인덱스
                if(startIndex == progresses.size-1){
                    answer.add(1)
                    break
                }
                while(true){
                    if(progresses[startIndex] >= 100){
                        temp++
                        startIndex++
                        if(startIndex == progresses.size){
                            answer.add(temp)
                            break
                        }
                    }else{
                        answer.add(temp)
                        temp = 0
                        break
                    }
                }
            }
        }
        println(answer)
        return answer.toIntArray()
    }
}