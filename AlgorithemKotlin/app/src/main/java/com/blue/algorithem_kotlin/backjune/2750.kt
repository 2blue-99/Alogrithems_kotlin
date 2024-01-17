package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2022-10-06
 * pureum
 */
fun main(){
    val num = readLine()?.toInt()
    val myArray = ArrayList<Int>()
    for(i in 1..num!!){
        myArray.add(readLine()!!.toInt())
    }
    myArray.sortDescending()
    myArray.forEach { println(it) }

    myArray.sort()
    myArray.forEach { println(it) }
}