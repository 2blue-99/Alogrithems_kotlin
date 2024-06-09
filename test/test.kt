package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi


fun main() {
    val arr = Array(1){ intArrayOf(1,2,3,4,5) }
    val arr2 = Array(1){ intArrayOf(1,2,3,4,5) }
    val arr3 = Array(1){0}
    val arr4 = Array(1){0}
    println(arr3.contentEquals(arr4))
}