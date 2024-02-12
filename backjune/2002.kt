package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 2023-12-12
 * pureum
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val repeat = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(repeat){ map[br.readLine()] = 1  }
    var count = 0
    repeat(repeat){
        val nList = map.keys
        val input = br.readLine()
        if(nList.first() != input){ count++ }
        map.remove(input)
    }
    println(count)
}