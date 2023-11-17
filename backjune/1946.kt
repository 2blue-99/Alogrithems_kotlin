package com.example.alogrithems.backjune

/**
 * 2023-04-12
 * pureum
 */

fun main(){
    repeat(readln().toInt()){
        val num = readln().toInt()
        var myArray = Array(num+1){0}
        repeat(num){
            val gap = readln().split(" ").map { it.toInt() }
            myArray[gap[0]] = gap[1]
        }
        var count = 1
        var min = myArray[1]
        for(i in 2..num){
            if(myArray[i]<min) {
                count++
                min = myArray[i]
            }
        }
        println(count)
    }
}