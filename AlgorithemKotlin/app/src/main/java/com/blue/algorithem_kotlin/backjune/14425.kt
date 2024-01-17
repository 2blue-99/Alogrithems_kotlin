package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-02-15
 * pureum
 */

val set = HashSet<String>()
val br = System.`in`.bufferedReader()
fun main() = with(System.out.bufferedWriter()){
    val (n,m) = br.readLine().split(' ').map{it.toInt()}
    var answer=0
    for(i in 0 until n){
        set.add(br.readLine())
    }
    for(i in 0 until m){
        if(set.contains(br.readLine()))
            answer++
    }
    println("$answer")
}
