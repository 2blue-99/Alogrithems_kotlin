package com.example.alogrithems.backjune

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