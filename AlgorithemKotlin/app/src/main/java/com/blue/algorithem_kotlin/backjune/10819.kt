package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-11-24
 * pureum
 */
var dapList = arrayListOf<List<Int>>()
var num = 0
//fun factorial(arrayList: ArrayList<Int>, completeList: List<Int>){
//    if(completeList.size == num) {
//        dapList.add(completeList)
//        return
//    }
//
//    for(i in arrayList){
//        var myList = ArrayList(arrayList)
//        myList.remove(i)
//        factorial(myList, completeList+i)
//    }
//    return
//}

//fun main(){
//    num = readln().toInt()
//    val inputList = readln().split(" ").map { it.toInt() }
//    for(i in inputList){
//        factorial(ArrayList(inputList-i), listOf(i))
//    }
//    var max = 0
//    for(i in dapList){
//        var hap = 0
//        for(k in 0 until num-1){
//            hap += abs(i[k] - i[k+1])
//            if(hap>=max)
//                break
//        }
//        if(hap > max)
//            max = hap
//    }
//    println(max)
//}








//fun main() {
//    val num = readln().toInt()
//    val inputList = readln().split(" ").map { it.toInt() }
//    val list5 = permutation(inputList)
//    var max = 0
////    list5.forEach { print("$it ") }
//
//    for(i in list5){
//        var hap = 0
//        for(k in 0 until num-1){
//            hap += abs(i[k] - i[k+1])
//        }
//        if(hap > max)
//            max = hap
//    }
//    println(max)
//}

//import kotlin.math.abs
//fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el ): List<List<T>> {
//    return if(sub.isEmpty()) listOf(fin)
//    else sub.flatMap {
//        permutation(el, fin + it, sub - it)
//    }
//}