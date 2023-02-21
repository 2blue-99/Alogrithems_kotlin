package com.example.alogrithems

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 2023-02-20
 * pureum
 */


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(List(this.readLine().toInt()) {this.readLine().toInt()}.sorted().joinToString("\n"))
//    val myList = mutableListOf<Int>()
//    for (i in 0 until readln().toInt()) myList.add(readln().toInt())
//    myList.sorted().forEach { println(it) }
}

