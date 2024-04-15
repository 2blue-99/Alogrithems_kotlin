package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class Solution {
    fun solution(numbers: IntArray): String {

        listOf(1,2).toIntArray()

        // 두 숫자 길이가 같은 경우엔 그냥 비교하고
        // 두 숫자 길이가 다른 경우엔 ab ba를 비교해서 더 큰걸로

        return numbers.map{it.toString()}
            .sortedWith(Comparator{a,b ->
                when{
                    a.length == b.length -> a.compareTo(b)
                    else -> (a+b).compareTo(b+a)
                }
            })
            .joinToString()


    }
}