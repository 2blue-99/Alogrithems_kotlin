package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

fun main(){
    val (a,b,c) = readln().split(" ").map { it.toLong() }

    fun pow(a: Long, b: Long, c: Long): Long{
        if(b==1L) return a % c
        if(b%2==0L) {
            val gap = pow(a,b/2, c)
            return (gap * gap) % c
        }
        else {
            val gap = pow(a, b/2, c)
            return ((gap * gap % c) * a) % c
        }
    }
    println(pow(a,b,c))
}