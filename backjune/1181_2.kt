package com.blue.algorithem_kotlin.backjune

fun main(){
    val list = mutableSetOf<String>()
    repeat(readln().toInt()){ list.add(readln()) }
    list.sortedWith(compareBy({it.length},{it})).forEach { println(it) }
}
