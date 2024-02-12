package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.lang.Integer.max

/**
 * 2023-11-28
 * pureum
 */

fun main() {
    val num = readln().toInt()
    val hapArr = Array(10_001) { 0 }
    val inputArr = Array(10_001) { 0 }
    repeat(num) {
        inputArr[it+1] = readln().toInt()
    }

    hapArr[0] = inputArr[0]
    for (i in 1 ..num) {
        when(i) {
            1 -> hapArr[1] = inputArr[1]
            2 -> hapArr[2] = inputArr[1] + inputArr[2]
            else -> hapArr[i] = max(inputArr[i] + hapArr[i-2], inputArr[i] + inputArr[i - 1] + hapArr[i - 3])
        }

    }
    println(hapArr[num])
}