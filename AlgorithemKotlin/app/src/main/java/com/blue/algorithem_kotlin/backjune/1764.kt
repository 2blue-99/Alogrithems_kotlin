package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-11
 * pureum
 */

fun main(){
    // 듣도 못한 사람과 보도 못한 사람의 중복을 찾기
    // 듣도 못한사람을 map에 넣고, 보도 못한것들을 맵과 비교
    val (d, b) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>()
    val list = mutableListOf<String>()
    repeat(d){ map[readln()] = "" }
    repeat(b){ readln().apply { if(map.contains(this)) list.add(this) } }
    list.apply {
        this.size
        this.sorted().forEach{println(it)}
    }
}