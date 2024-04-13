package com.blue.algorithem_kotlin.backjune

fun main() {
    val (n,m) = readln().split(" ").map{it.toInt()}
    val map = mutableMapOf<String, String>()
    repeat(n){
        val (addr,pw) = readln().split(" ")
        map[addr] = pw
    }
    repeat(m){
        println(map[readln()])
    }
}