package com.example.alogrithems.backjune

import kotlin.math.min

/**
 * 2023-07-27
 * pureum
 */

fun main() {
    var (a, b) = readln().split(" ")
    var count = 0
    if (a.length == b.length) {
        repeat(a.length){
            if(a[it] != b[it])
                count++
        }
        println(count)
    } else {
        var max = 0
        for ((start, i) in (0 until b.length - a.length + 1).withIndex()) {
            count = 0
            val sliceB = b.slice(start until a.length + start)
            repeat(a.length) {
                if (sliceB[it] == a[it])
                    count++
            }
            if (count == a.length) {
                max = count
                break
            }
            if (max < count) max = count
        }
        println(a.length - max)
    }
}