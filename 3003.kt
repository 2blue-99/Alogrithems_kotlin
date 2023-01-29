package com.example.alogrithems

/**
 * 2022-12-27
 * pureum
 */

fun main(){
    val i : List<String> = readLine()!!.split(" ")
    val a = listOf(1,1,2,2,2,8)
    for(num in i.indices){
        if(i[num].toInt() > a[num])
            print("-${i[num].toInt()-a[num]}")
        else if(i[num].toInt() == a[num])
            print("0")
        else
            print(a[num]-i[num].toInt())
        print(" ")
    }
}