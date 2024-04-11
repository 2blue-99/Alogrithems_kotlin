package com.blue.algorithem_kotlin.programmers

class BigNum {
    fun solution(numbers: IntArray): String {
        // 두 숫자 길이가 같은 경우엔 그냥 비교하고
        // 두 숫자 길이가 다른 경우엔 ab ba를 비교해서 더 큰걸로
        val list = numbers.map{it.toString()}
            .sortedWith(Comparator{a,b ->
                when{
                    a.length == b.length -> b.compareTo(a)
                    else -> (b+a).compareTo(a+b)
                }
            })
            .joinToString("")
        return if(list.first()=='0') "0"
        else list
    }
}