package com.blue.algorithem_kotlin.backjune

fun main(){
    var ham = 2000
    var coke = 2000
    repeat(3){
        val gap = readln().toInt()
        if(gap<ham) ham = gap
    }
    repeat(2){
        val gap = readln().toInt()
        if(gap<coke) coke = gap
    }
    println(ham + coke - 50)
}