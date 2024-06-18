package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi


fun main() {
    val arr = Array(1){ intArrayOf(1,2,3,4,5) }
    val arr2 = Array(1){ intArrayOf(1,2,3,4,5) }

    val test = arr.copyOf()

    test[0] = intArrayOf(99,99,99,99)

    arr.forEach { println(it.contentToString()) }
    test.forEach { println(it.contentToString()) }

}