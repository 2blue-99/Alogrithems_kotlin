package com.blue.algorithem_kotlin.backjune

fun main(){
    val (j,n) = readln().split(" ").map { it.toInt() }
    var result = 0
    repeat(n){
        var cnt = 0
        readln().toList().forEach {
            if(it.isUpperCase())
                cnt += 4
            else if(it == ' ')
                cnt += 1
            else
                cnt += 2
        }
        if(cnt <= j)
            result+=1
    }
    println(result)
}