package com.example.alogrithems

/**
 * 2023-01-30
 * pureum
 */
fun main(){
    val (hap, want)= readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val list = arrayListOf<Int>()
    for((indexA,a) in nums.slice(0..nums.lastIndex-2).withIndex()){
        for((indexB,b) in nums.slice((indexA+1) until nums.lastIndex).withIndex()) {
            for ((indexC, c) in nums.slice((indexA + indexB + 2)..nums.lastIndex).withIndex()) {
                if (a + b + c <= want) {
                    list.add(a + b + c)
                }
            }//5 6 7 8 9
        }
    }
    println(list.max())
}