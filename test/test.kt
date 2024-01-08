package com.example.alogrithems.test

import java.util.LinkedList

/**
 * 2023-11-18
 * pureum
 */
data class Test(
    val name : String,
    val age :Int
)
fun main() {
    val gap = mutableListOf(Test("a", 4),Test("b", 3),Test("c", 2),Test("a", 1))
    val gap2 = Array<Int>(10){0}
//    println(gap)
//    println(gap.sortedBy{it.name })
//    println(gap.sortedWith(compareBy<Test>{it.name}.thenBy{it.age} ))

    println(gap.onEach { it.age+5 })
    println(gap.forEach { it.age+5 })
    val map = emptyList<Int>()
}