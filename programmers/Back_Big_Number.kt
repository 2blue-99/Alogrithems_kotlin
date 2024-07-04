package com.blue.algorithem_kotlin.programmers

fun main(){
    Back_Big_Number().solution(intArrayOf())
}

class Back_Big_Number {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size){-1}
        for(i in numbers.indices){
            if(i < numbers.size-1){
                for(j in i+1 until numbers.size){
                    if(numbers[i] < numbers[j]) {
                        answer[i] = numbers[j]
                        break
                    }
                }
            }
        }
        return answer
    }
}