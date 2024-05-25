package com.blue.algorithem_kotlin.programmers

fun main() {
//    val gap = Big_Number().solution("1924", 2)
//    val gap = Big_Number().solution("9876543214", 4)
//    val gap = Big_Number().solution("190000002", 3)
//    val gap = Big_Number().solution("3879781299", 2)
    val gap = Big_Number().solution("720378", 2)
    println(gap)
}

class Big_Number {
    fun solution(number: String, k: Int): String {
        var answer = 0L
        var numberList = number.toList()
        var arr = BooleanArray(number.length)

        fun bt(n: Int, s: Int) {
            if (n == number.length - k) {
                var num = ""
                arr.indices
                    .filter { arr[it] }
                    .forEach { num += numberList[it] }
                if (num.toLong() > answer) answer = num.toLong()
                return
            }
            for ((index, i) in numberList.withIndex()) {
                if (index <= s) continue
                arr[index] = true
                bt(n + 1, index)
                arr[index] = false
            }
        }

        bt(0, -1)

        return answer.toString()
    }
}