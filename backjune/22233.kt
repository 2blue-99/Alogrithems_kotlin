package com.example.alogrithems.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main(){

//    val queue = ArrayDeque<Int>()



    // 메모장 키워드 개수 N, 블로그에 쓴 글 개수M
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableMapOf<String,Int>()
    val (n,m) = br.readLine().split(" ").map{ it.toInt() }
    for(z in 1..n){
        br.readLine().let {
            map[it] = map.getOrDefault(it,0)
        }
    }
    for(i in 1..m){
        br.readLine().split(",").let {
            for(k in it.indices){
                map.remove(it[k])
            }
            bw.write(map.keys.size.toString()+"\n")
        }
    }
    bw.flush()
    bw.close()
}