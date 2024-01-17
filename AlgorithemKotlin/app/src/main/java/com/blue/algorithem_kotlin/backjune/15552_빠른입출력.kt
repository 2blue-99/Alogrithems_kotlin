package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/**
 * 2023-01-03
 * pureum
 */

fun main(){
    val num = BufferedReader(InputStreamReader(System.`in`))
    val result = BufferedWriter(OutputStreamWriter(System.out))
    repeat(num.readLine().toInt()){
        val token = StringTokenizer(num.readLine())
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
        result.write(sum + "\n")
    }
    result.flush()
    result.close()
}

