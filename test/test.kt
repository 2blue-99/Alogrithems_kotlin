package com.example.alogrithems.test

/**
 * 2023-11-18
 * pureum
 */

fun main() {
    val map = mutableMapOf<String, MutableList<Int>>()
    val sMap = mutableMapOf<String, Int>()
    val iMap = mutableMapOf<String, MutableList<Int>>()
    val dapList = mutableListOf<Int>()
    val genres = mutableListOf("classic", "pop", "classic", "classic", "pop")
    val plays = intArrayOf(500, 600, 700, 800, 900)

    for(i in genres.indices){
        if(map.containsKey(genres[i])) map[genres[i]]!!.add(plays[i])
        else map[genres[i]] = mutableListOf(plays[i])

        if(sMap.containsKey(genres[i])) sMap[genres[i]] = sMap[genres[i]]!!.plus(plays[i])
        else sMap[genres[i]] = plays[i]

        if(iMap.containsKey(genres[i])) iMap[genres[i]]!!.add(i)
        else iMap[genres[i]] = mutableListOf(i)
    }

    repeat(map.size){
        val key = sMap.maxByOrNull { it.value }?.key
        repeat(2){
            println("map = $map")
            println("iMap = $iMap")
            println("sMap = $sMap")
            println(dapList)
            println()
            val max = map[key]!!.maxOfOrNull{it} ?: return@repeat
            println("max = $max")
            val gap = iMap[key]!!.get(map[key]!!.indexOf(max))
            dapList.add(gap)
            val index = map[key]!!.indexOf(max)
            println("index = $index")
            map[key]!!.remove(max)
            iMap[key]!!.remove(gap)
        }
        sMap.remove(key)
        map.remove(key)
        iMap.remove(key)
    }

    println(dapList)
}