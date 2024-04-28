package com.blue.algorithem_kotlin.backjune

import kotlin.math.pow

fun main() {
    val list = listOf(
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white"
    )

    var temp = ""
    var result = 0.0
    repeat(3){
        val input = readln()
        val index = list.indexOf(input)
        if(it == 2){
            result = temp.toInt() * 10.0.pow(index)
            return@repeat
        }
        temp += index
    }
    println(result.toLong())
}