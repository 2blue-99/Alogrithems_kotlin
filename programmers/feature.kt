package com.blue.algorithem_kotlin.programmers

fun main(){
//    Feature().solution(progresses = intArrayOf(93,30,55), speeds = intArrayOf(1,30,5))
//    Feature2().solution(progresses = intArrayOf(93,30,55), speeds = intArrayOf(1,30,5))
//    Feature().solution(progresses = intArrayOf(95, 90, 99, 99, 80, 99), speeds = intArrayOf(1, 1, 1, 1, 1, 1))
//    Feature2().solution(progresses = intArrayOf(95, 90, 99, 99, 80, 99), speeds = intArrayOf(1, 1, 1, 1, 1, 1))
    Feature2().solution(progresses = intArrayOf(1, 95, 95, 95), speeds = intArrayOf(99, 1, 1, 1))
}

class Feature2 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = arrayListOf<Int>()
        var pArr = progresses.copyOf()
        var sArr = speeds.copyOf()


        while(true){
            pArr.indices.forEach{
                pArr[it] += sArr[it]
            }

            if(pArr[0] >= 100){
                val index = pArr.indexOfFirst{ it<100 }
                if(index == -1) {
                    answer.add(pArr.size)
                    break
                }
                pArr = pArr.sliceArray(index until pArr.size)
                sArr = sArr.sliceArray(index until sArr.size)
                answer.add(index)
            }
        }
        println(answer)
        return answer.toIntArray()
    }
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