package com.blue.algorithem_kotlin.backjune

fun main() {
    val map = mutableMapOf<String, Boolean>()
    val n = readln().toInt()
    var state = false
    repeat(n){
        val (a,b) = readln().split(" ")
        if(a == "ChongChong"|| b == "ChongChong"){
            map["ChongChong"] = true
            state = true
        }

        if(state){
            if(map[a]==true)
                map[b]= true
            else if(map[b]==true)
                map[a] =true
        }
    }
    println(map.toList().count { it.second })
}