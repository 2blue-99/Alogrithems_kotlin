package com.blue.algorithem_kotlin.backjune

fun main() {
    val a = readln()
    var cnt = 0
    var temp = ""
    a.forEach{
        cnt++
        temp+=it
        if(cnt==10){
            println(temp)
            temp = ""
            cnt = 0
        }
    }
    if(cnt != 0)
        println(temp)
}