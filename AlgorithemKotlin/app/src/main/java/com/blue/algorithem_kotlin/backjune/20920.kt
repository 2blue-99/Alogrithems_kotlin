package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    // 1. 자주 나오는 단어 앞에 배치
    // 2. 단어 길이가 길수록 앞에 배치
    // 3. 알파벳순으로 앞 배치
    // m보다 짧은 것은 제외

    // 값 받기고 map에 넣기
    // 정렬해서 출력
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    var map = mutableMapOf<String, Int>()
    for(i in 0 until n){
        val alpha = br.readLine()
        if(alpha.length < m) continue
        if(map.containsKey(alpha))
            map[alpha] = map[alpha]!!.plus(1)
        else
            map[alpha] = 1
    }
    map.toList().sortedWith(compareByDescending<Pair<String, Int>> {it.second}.thenByDescending{it.first.length}.thenBy{it.first}).toMap().keys.forEach{bw.write(it+"\n")}
    bw.flush()
    bw.close()
}