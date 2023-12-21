package com.example.alogrithems.backjune

/**
 * 2023-12-21
 * pureum
 */

fun main(){
    val (a,b,c) = readln().split(" ").map { it.toLong() }
    println(test1629(a,b,c))
}

fun test1629(a:Long, b:Long, c:Long): Long{
    if(b == 0L) return 1
    if(b == 1L) return a % c
    val multi = test1629(a,b/2,c) % c
    return if(b%2L==0L) multi * multi % c
    else multi * multi % c * a % c
}