package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.util.*

/**
 * 2023-05-02
 * pureum
 */
fun main() {
    var (nums, range) = readln().split(" ").map { it.toInt() }
    var gap = readln().toList().map { it.toString() }

    //햄버거 F, 사람 T
    val myDeque = ArrayDeque<String>()
    var count = 0
    for (i in gap) {

    }
    println(count)
}


//    var myArray = Array(20011) { "E" }
//    var count = 0
//    var ok=0
//    for (i in 0 until nums) {
//        myArray[i] = gap[i].toString()
//    }
//    for(i in 0 until nums) {
//        if (myArray[i] == "P") {
//            for( k in range downTo 1){
//                if(i-k<0) continue
//                if(myArray[i - k] == "H") {
//                    myArray[i - k]="E"
//                    count++
//                    ok=1
//                    break
//                }
//            }
//            if(ok==1){
//                ok=0
//                continue
//            }
//            for( k in 1..range){
//                if(i+k>nums) continue
//                if(myArray[i+k] == "H") {
//                    myArray[i+k]="E"
//                    count++
//                    break
//                }
//            }
//        }
//    }
//    println(count)
//}