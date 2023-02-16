package com.example.alogrithems

import java.math.BigInteger

fun main(){
    val num = readln().toInt()
    val myArray = arrayListOf<Int>()
    var myList = listOf<Int>()

    for(i in 1..num){
        myArray.add(readln().toInt())
    }
    myList = myArray
    myList.sorted().forEach { println(it) }
}
