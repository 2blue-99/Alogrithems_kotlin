package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-01-05
 * pureum
 */
fun main(){
    val count = readln().toDouble()
    var nums = readln().split(" ").map{it.toDouble()}
    val max = nums.max()
    nums = nums.map{
        it/max*100
    }
    println(nums.average())
}