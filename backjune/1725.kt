package com.blue.algorithem_kotlin.backjune

import java.util.Stack

fun main() {
    val maxWidth = readln().toInt()
    val arr = IntArray(maxWidth+2)
    repeat(maxWidth){
        arr[it+1] = readln().toInt()
    }
    var answer = 0L
    val stack: Stack<Int> = Stack()

    stack.add(0)
    for(i in 1..maxWidth+1) {
        while(stack.isNotEmpty() && arr[stack.peek()] > arr[i]) {
            val height = arr[stack.pop()]
            val size = ((i-stack.peek()-1) * height).toLong()
            answer = kotlin.math.max(answer, size)
        }
        stack.add(i)
    }
    println(answer)
}

//fun main() {
//    val maxWidth = readln().toInt()
//    val list = mutableListOf<Int>()
//    repeat(maxWidth){
//        list.add(readln().toInt())
//    }
//    val maxHeight = list.maxOf{it}
//    var answer = 0L
//
//    for(target in  maxHeight downTo 1){
//        var cnt = 0
//        for((index, height) in list.withIndex()){
//            if(target <= height){
//                cnt++
//            }else{
//                val size = (cnt * target).toLong()
//                if(answer < size) answer = size
//                cnt = 0
//            }
//            if(index == list.size-1){
//                val size = (cnt * target).toLong()
//                if(answer < size) answer = size
//            }
//        }
//    }
//    println(answer)
//}