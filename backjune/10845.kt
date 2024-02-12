package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-12-13
 * pureum
 */

fun main(){
    val test = Test()

    repeat(readln().toInt()){
        val input = readln().split(" ")
        when(input[0]){
            "push" -> test.push(input[1].toInt())
            "pop" -> println(test.pop())
            "size" -> println(test.size())
            "empty" -> println(test.empty())
            "front" -> println(test.front())
            else -> println(test.back())
        }
    }
}

class Test {
    val arr = IntArray(10_000){0}
    var top = 0
    var tail = 0
    fun push(num: Int){
        arr[top] = num
        top++
    }
    fun pop(): Int =
        if(empty()==0) {
            tail++
            arr[tail-1]
        }
        else -1
    fun size() = top-tail
    fun empty(): Int = if(top==tail) 1 else 0
    fun front():Int = if(empty()==0) arr[tail] else -1
    fun back() = if(empty()==0) arr[top-1] else -1
}