package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-07-26
 * pureum
 */
fun main(){

    val (n, k) = readln().split(" ").map { it.toInt() }


    var myList = mutableListOf<Int>()

    repeat(n){
        myList.add(it+1)
    }

    var now = 0
    var count = 1
    var dap = 0
    var out = StringBuilder()

    out.append("<")
    while(true){

        if(now==myList.size) now -= myList.size
        if(count == k) {
            out.append("${myList[now]}")
            myList.removeAt(now)
            count = 1
            dap ++
            if(dap == n){
                break
            }
            out.append(", ")
            continue
        }
        count++
        now++
    }
    out.append(">")
    println(out)
}