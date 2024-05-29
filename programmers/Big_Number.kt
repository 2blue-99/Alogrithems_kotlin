package com.blue.algorithem_kotlin.programmers

import java.util.Stack

fun main() {
    Big_Number().solution("333222111", 3)
}

// 24.05.29 풀이
class Big_Number {
    fun solution(number: String, k: Int): String {
        var stack = Stack<Int>()
        var index = 0
        var pk = k
        while(index < number.length){
            val num = number[index].toString().toInt()
            if(pk != 0 && stack.isNotEmpty() && stack.peek() < num){
                stack.pop()
                pk--
            }else{
                stack.add(num)
                index++
            }
        }
        return stack.slice(0 until number.length-k).joinToString("")
    }
}

// 24.05.28 풀이
//class Big_Number {
//    fun solution(number: String, k: Int): String {
//        var nk = k
//        var list = number.toList().map{it.toString().toInt()}
//        val stack = Stack<Int>()
//        var index = 0
//        while(index < list.size){
//            if(stack.isEmpty() || stack.peek() >= list[index]){
//                stack.add(list[index])
//            }else{
//                while(nk > 0 && stack.isNotEmpty() && stack.peek() < list[index]) {
//                    stack.pop()
//                    nk--
//                }
//                stack.add(list[index])
//            }
//            index ++
//        }
//        return stack.joinToString("").slice(0 until list.size - k)
//    }
//}


// 24.05.27 풀이
//class Big_Number {
//    fun solution(number: String, k: Int): String {
//        var answer = 0L
//        var numberList = number.toList()
//        var arr = BooleanArray(number.length)
//
//        fun bt(n: Int, s: Int) {
//            if (n == number.length - k) {
//                var num = ""
//                arr.indices
//                    .filter { arr[it] }
//                    .forEach { num += numberList[it] }
//                if (num.toLong() > answer) answer = num.toLong()
//                return
//            }
//            for ((index, i) in numberList.withIndex()) {
//                if (index <= s) continue
//                arr[index] = true
//                bt(n + 1, index)
//                arr[index] = false
//            }
//        }
//
//        bt(0, -1)
//
//        return answer.toString()
//    }
//}