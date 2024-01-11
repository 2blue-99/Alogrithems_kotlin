package com.example.alogrithems.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val inputList = mutableListOf<List<String>>()
    val map = hashMapOf<String, Double>()
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val king = br.readLine()
    val compareList = mutableListOf<String>()

    repeat(n){ inputList.add(br.readLine().split(" ")) }

    repeat(m){ compareList.add(br.readLine()) }

    inputList.map { it.slice(1..2) }
        .forEach {
            it.forEach {
                map[it] = map.getOrDefault(it, 0.0)
            }
        }

    inputList.map { it.first() }.forEach { map.remove(it) }

    map[king] = 1.0

    while(inputList.isNotEmpty()){
        for(i in inputList.indices){
            val child = inputList[i][0]
            val left = inputList[i][1]
            val right = inputList[i][2]
            if(map[left] == null || map[right] == null) continue
            map[child] = map.getOrDefault(child, (map[left]!! + map[right]!!)/2)
            inputList.removeAt(i)
            break
        }
    }

    bw.write(compareList.groupBy { map[it] }
        .toList()
        .sortedByDescending { it.first }
        .take(1).first()
        .second.first())
    bw.flush()
    bw.close()
}