package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi


fun main() {
    val arr = Array(1){IntArray(1)}
    val new = arr.copyOf()
    arr.forEach { println(it.contentToString()) }
    new.forEach { println(it.contentToString()) }
    arr[0] = intArrayOf(5)
    println()
    arr.forEach { println(it.contentToString()) }
    new.forEach { println(it.contentToString()) }
}