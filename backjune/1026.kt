package com.example.alogrithems.backjune

import androidx.recyclerview.widget.SortedList
import kotlin.math.ceil
import kotlin.math.min

/**
 * 2023-03-20
 * pureum
 */

//fun main(){
//    val (broken,num) = readln().split(" ").map { it.toInt() }
//    val bundle = broken / 6
//    val piece = broken % 6
//    var b = arrayListOf<Int>()
//    var p = arrayListOf<Int>()
//
//    for(i in 1..num){
//        val (B,P) = readln().split(" ").map { it.toInt() }
//        b.add(B)
//        p.add(P)
//    }
//
//    val mixedDap = b.min() * bundle + p.min() * piece
//    val pieceDap = p.min() * broken
//    val bundleDap = b.min() * (bundle+1)
//    println(min(min(mixedDap, pieceDap), bundleDap))
//}

//fun main(){
//    val num = readln().toInt()
//    var sum = 0
//    val listA = readln().split(" ").map { it.toInt() }.sorted()
//    val listB = readln().split(" ").map { it.toInt() }.sorted().reversed()
//    repeat(num){
//        sum += listA[it] * listB[it]
//    }
//    println(sum)
//}

fun main() {
    val num = readln().toInt()
    var a = readln().split(" ").map { it.toInt() }.toIntArray().sorted()
    var b = readln().split(" ").map { it.toInt() }.toIntArray().sorted().reversed()
    var sum = 0
    repeat(num){ sum+= a[it] * b[it] }
    println(sum)
}



//    var sum = 0
//    val arrayA = Array(101){0}
//    val arrayB = Array(101){0}
//    readln().split(" ").map { arrayA[it.toInt()] += 1 }
//    readln().split(" ").map { arrayB[it.toInt()] += 1 }

//    val listA = mutableListOf<Int>()
//    val listB = mutableListOf<Int>()

//    for( (index,i) in arrayA.withIndex()){
//        if(i>=1){
//            for(k in 1..i)
//                listA.add(index)
//        }
//    }
//
//    for( (index,i) in arrayB.withIndex()){
//        if(i>=1)
//            for(k in 1..i)
//                listB.add(index)
//    }

//    var countA = num
//    var countB = num
//    var count=0
//    for((indexA,i) in arrayA.withIndex()){
//        if(count==num) break
//        if(i>0){
//            arrayA[indexA]-=1
//            for((indexB,k) in arrayB.withIndex().reversed()){
//                if(k>0){
//                    arrayB[indexB]-=1
//                    sum+= indexA * indexB
//                    count++
//                    println("$indexA, $indexB")
//                    break
//                }
//            }
//        }
//    }
//    arrayA.maxOrNull()
//    println(sum)


