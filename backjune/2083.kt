package com.blue.algorithem_kotlin.backjune

fun main(){
    while (true){
        val (name, age, weight) = readln().split(" ")
        if(name == "#") break
        if(age.toInt() > 17 || weight.toInt() >= 80) println("$name Senior")
        else println("$name Junior")
    }
}