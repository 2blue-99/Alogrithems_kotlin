package com.blue.algorithem_kotlin.backjune

fun main() {
    val s = readln()
    val list = mutableListOf<String>()
    for(i in 0..s.length-1){
        list.add(s.slice(i..<s.length))
    }
    list.sorted().forEach { println(it) }
}