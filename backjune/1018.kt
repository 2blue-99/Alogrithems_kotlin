package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-02-01
 * pureum
 */

fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val list = ArrayList<List<String>>()
    val dapList = ArrayList<Int>()
    for(i in 1..n){ list.add(readln().chunked(1)) }

    var (index,count) = listOf(0,0)
    var change = true
    var listSlice:Int
    for(a in 1..2) {
        listSlice = 0
        for (z in 0..(n - 8)) { //아래로 내리기
            index = 0
            for (k in 0..(m - 8)) { //오른쪽으로 옮기기
                count = 0
                for (row in list.slice(listSlice until listSlice + 8)) { //8개의 줄
                    for (i in index until index + 8) {
                        if (change) {
                            if (row[i] != "W") { count++ }
                        } else {
                            if (row[i] != "B") { count++ }
                        }
                        change = !change
                    }
                    change = !change
                }
                index++
                dapList.add(count)
            }
            listSlice++
        }
        change = !change
    }
    println(dapList.min())
}