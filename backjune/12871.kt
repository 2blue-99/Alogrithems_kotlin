package com.blue.algorithem_kotlin.backjune

fun main() {
    val s = readln()
    val t = readln()
    var tempS = ""
    var tempT = ""

    for(i in t.indices){
        tempS += s
    }
    for(i in s.indices){
        tempT += t
    }
    if(tempS == tempT) println(1)
    else println(0)
}