package com.blue.algorithem_kotlin.backjune

import java.util.LinkedList
import java.util.Queue

fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    val n = readln().toInt()

    val list = mutableListOf<List<Int>>()
    val result = mutableListOf<Int>()
    var max = 0

    repeat(n) { list.add(readln().split(" ").map { it.toInt() }) }

    fun check(a: List<Int>, b: List<Int>): Boolean {
        if (a.first() + b.first() <= w && kotlin.math.max(a.last(), b.last()) <= h) return true
        if (kotlin.math.max(a.first(), b.first()) <= w && a.last() + b.last() <= h) return true
        return false
    }

    for (i in list.indices) {
        for (j in i + 1 until list.size) {
            var a = list[i] //2 1
            var b = list[j] //3 4
            var sum = a.first() * a.last() + b.first() * b.last()
            if(sum < max) continue

            if (check(a, b)) {
                result.add(sum)
                max = sum
                continue
            }
            if (check(a.reversed(), b)) {
                result.add(sum)
                max = sum
                continue
            }
            if (check(a, b.reversed())) {
                result.add(sum)
                max = sum
                continue
            }
            if (check(a.reversed(), b.reversed())) {
                result.add(sum)
                max = sum
                continue
            }
        }
    }
    if (result.size == 0) println(0)
    else println(result.max())
}