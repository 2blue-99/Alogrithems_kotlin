package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-11-27
 * pureum
 */

fun main(){
    repeat(readln().toInt()) {
        var hap = 1
        val map = mutableMapOf<String, MutableList<String>>()
        repeat(readln().toInt()) {
            val (name, kind) = readln().split(" ")
            if (!map.containsKey(kind))
                map[kind] = mutableListOf(kind)
            else
                map[kind]!!.add(name)
        }
        for(i in map.keys){
            hap *= (map[i]!!.size + 1)
        }
        println(hap-1)
    }
}