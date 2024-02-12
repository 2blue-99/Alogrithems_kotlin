package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-22
 * pureum
 */
fun main(){
    while(true){
        val input = readln().toInt()
        if(input == -1) break
        val list = mutableListOf<Int>()
        for(i in 1..input/2+1){
            if(input % i == 0) list.add(i)
        }
        if(list.sum() == input) {
            print("$input = ")
            list.forEachIndexed { index, i ->  if(index!=list.size-1) print("$i + ") else print("$i") }
            println()
        }else{
            println("$input is NOT perfect.")
        }
    }
}