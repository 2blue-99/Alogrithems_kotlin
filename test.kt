package com.example.alogrithems

import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.math.BigInteger
import java.util.*
import kotlin.math.max

fun main() {
    var begin = System.currentTimeMillis()
    var num1 = mutableSetOf<Int>()
    for (i in 1..10000000) {
        num1.add(i)
    }
    var end = System.currentTimeMillis()
    println("add mutableSet : ${end - begin}")

    begin = System.currentTimeMillis()
    var num2 = hashSetOf<Int>()
    for (i in 1..10000000) {
        num2.add(i)
    }
    end = System.currentTimeMillis()
    println("add hashSetOf : ${end - begin}")

    begin = System.currentTimeMillis()
    var num3 = TreeSet<Int>()
    for (i in 1..10000000) {
        num3.add(i)
    }
    end = System.currentTimeMillis()
    println("add TreeSet : ${end - begin}")




    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num1.contains(i)
    end = System.currentTimeMillis()
    println("contains mutableSet : ${end - begin}")

    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num2.contains(i)
    end = System.currentTimeMillis()
    println("contains hashSetOf : ${end - begin}")

    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num3.contains(i)
    end = System.currentTimeMillis()
    println("contains TreeSet : ${end - begin}")


    println(num1)
    println(num2)
    println(num3)


    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num1.remove(i)
    end = System.currentTimeMillis()
    println("remove mutableSet : ${end - begin}")

    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num2.remove(i)
    end = System.currentTimeMillis()
    println("remove hashSetOf : ${end - begin}")

    begin = System.currentTimeMillis()
    for (i in 10000000 downTo 1)
        num3.remove(i)
    end = System.currentTimeMillis()
    println("remove TreeSet : ${end - begin}")

}
