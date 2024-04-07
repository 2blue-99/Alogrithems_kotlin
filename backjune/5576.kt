package com.blue.algorithem_kotlin.backjune

fun main() {
    repeat(2){
        val list = mutableListOf<Int>()
        repeat(10){
            list.add(readln().toInt())
        }
        println(list.sortedDescending().slice(0..2).sumOf{it})
    }
}