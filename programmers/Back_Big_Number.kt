package com.blue.algorithem_kotlin.programmers

import java.util.*

fun main(){
    Back_Big_Number().solution(intArrayOf())
}

class Back_Big_Number {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size){-1}
        val stack: Stack<Int> = Stack()
        for(i in (numbers.size-1) downTo 0){
            if(stack.isEmpty()){
                answer[i] = -1
            }else{
                while(stack.isNotEmpty()){
                    if(stack.peek() > numbers[i]){
                        answer[i] = stack.peek()
                        break
                    }else{
                        stack.pop()
                    }
                }
            }
            stack.push(numbers[i])
        }
        return answer
    }
}