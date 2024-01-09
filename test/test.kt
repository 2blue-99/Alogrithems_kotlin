package com.example.alogrithems.test

import java.util.LinkedList
import java.util.Queue

/**
 * 2023-11-18
 * pureum
 */

fun main() {

    lateinit var gap: Array<IntArray>
    var a = Array<Int>(5){it+1}
    a[3] = 100
    val b = a.toMutableList()
    val c = b.toMutableList()
    b[2] = 100
    println(b)
    println(c)
    c[2] = 88
    println(b)
    println(c)
    println(a.contentToString())
}