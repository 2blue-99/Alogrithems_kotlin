package com.blue.algorithem_kotlin.backjune

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = Array(10){0}
    val vArr = Array(10){false}

    fun dfs(k: Int) {
        if (k == m) {
            for(i in 0 until m){
                bw.write("${arr[i]} ")
            }
            bw.newLine()
            return
        }
        for (i in 1..n ) {
            if (!vArr[i]) {
                arr[k] = i
                vArr[i] = true
                dfs(k + 1)
                vArr[i] = false
            }
        }
    }
    dfs(0)
    bw.flush()
    bw.close()
}

//fun main() {
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val resultList = mutableListOf<Int>()
//
//    fun dfs(num: Int, list: MutableList<Int>) {
//        if (list.size == m) {
//            list.forEach { bw.write("$it ") }
//            bw.newLine()
//            return
//        }
//        for (i in 1..num) {
//            if (list.contains(i)) continue
//            val newList = list.toMutableList()
//            newList.add(i)
//            dfs(num, newList)
//        }
//    }
//    dfs(n, resultList)
//    bw.flush()
//    bw.close()
//}