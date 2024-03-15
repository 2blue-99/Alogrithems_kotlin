package com.blue.algorithem_kotlin.backjune

import android.util.Log

fun main(){
    val map = mutableMapOf<String, Int>()
    repeat(readln().toInt()){
        val s = readln()
        var exist = false
        for(index in s.indices){
            val new = s.slice(index until s.length) + s.slice(0 until index)
            if(map.containsKey(new)){
                map[new]!!.plus(1)
                exist = true
                break
            }
        }
        if(!exist)
            map[s] = map.getOrDefault(s, 1)
    }
    println(map.size)
}