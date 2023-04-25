package com.example.alogrithems

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.math.max

fun main() {
    var gap = mutableMapOf<Int,List<Int>>()
    gap.put(1, listOf(1,2,3,4))
    gap.put(10, listOf(1,2,3,4))
    gap.put(3, listOf(10,20,30,40))
    gap.put(7, listOf(1,2,3,4))
    gap.put(5, listOf(100,200,300,400))
    println(gap)
    gap = gap.toList().sortedBy { it.second[0] }.toMap().toMutableMap()
    println(gap)
}
