package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune.empty

data class Test(
    val a: Int
)

fun main() {
    val gap: List<Test> = mutableListOf<Test>()
    println(gap.isEmpty())
}