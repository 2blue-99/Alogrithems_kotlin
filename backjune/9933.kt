package com.blue.algorithem_kotlin.backjune

fun main() {
    val map = mutableMapOf<String, Int>()
    repeat(readln().toInt()){
        val (fruit, cnt) = readln().split(" ")
        map[fruit] = map.getOrDefault(fruit, 0) + cnt.toInt()
    }
    if(map.values.contains(5)) println("YES")
    else println("NO")
}