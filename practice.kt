package com.example.alogrithems

fun main(){
    val a : ArrayList<Int> = arrayListOf(1,2,3,4,5,6)
    val b : ArrayList<Int> = arrayListOf(1,2,3,4,5)


    a.forEachIndexed { index, i ->
        println("${index}, ${i}")
    }


}