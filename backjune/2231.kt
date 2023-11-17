package com.example.alogrithems.backjune
/**
 * 2023-01-30
 * pureum
 */
fun main() {
    var gap = readln().toInt()
    var generator = if(gap - gap.toString().length * 9 < 0) 2  else gap - gap.toString().length * 9
    var nums = listOf<Int>()
    var hap = 0
    if(gap<10)
        generator = gap/2
    else
        while(true){
            nums = generator.toString().chunked(1).map { it.toInt() }
            hap = nums.sum() + generator
            if(hap == gap || generator > gap) break
            generator++
        }
    if(hap > gap) println(0)
    else println(generator)
}