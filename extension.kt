package com.example.alogrithems

import android.util.Log

/**
 * 2022-11-09
 * pureum
 */

fun main(){
    val number : List<Int> = listOf(1,2,3,4,5,6,7,8)
    val filtered = number.getHigherThan(3).toString()
    val number2 : List<Int> = listOf(1,2,3,4)
    val filtered2 = number2.getHigherThan(3).toString()
    System.out.println(number)
    System.out.println(filtered)

    System.out.println(number2)
    System.out.println(filtered2)

    println(String().hello("zz"))
    println(Exception().fuckU("hello"))
}

fun List<Int>.getHigherThan(num: Int): List<Int>{
    val result = arrayListOf<Int>()
    for(item in this){
        if(item > num) result.add(item)
    }
    return result
}

fun String.hello(data:String): String{
    return "hi"
}

fun Exception.fuckU(data:String):String{
    return "asshole"
}

fun fuckU(){

}

