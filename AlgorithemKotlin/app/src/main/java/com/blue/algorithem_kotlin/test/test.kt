package com.example.alogrithems.test

import java.util.LinkedList
import java.util.Queue

/**
 * 2023-11-18
 * pureum
 */

fun main() {
    val list = listOf(-1,-2,1,5)
    val list2 = listOf(-1,-2,1,5)
    val list3 = listOf(-1,5,1,-2)
    val list4 = mutableListOf<List<Int>>()
    list4.add(list)
    list4.add(list2)
    list4.add(list3)
    println(list4)
    println(list4.toSet())
}