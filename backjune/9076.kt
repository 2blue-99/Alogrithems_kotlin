package com.blue.algorithem_kotlin.backjune

fun main() {
    repeat(readln().toInt()){
        val list = readln().split(" ").map{it.toInt()}.sorted().slice(1..3)
        if(list.last() - list.first() >= 4) println("KIN")
        else println(list.sumOf{it})
    }
}