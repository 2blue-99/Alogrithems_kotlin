package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

import java.util.Stack

/**
 * 2023-12-13
 * pureum
 */

fun main(){
    loop@ while(true){
        val stack = Stack<Char>()
        val input = readln()
        if(input==".") break

        for(it in input) {
            when(it){
                '(' -> { stack.push(')') }
                '[' -> { stack.push(']') }
                ']' -> {
                    if(stack.isEmpty() || stack.pop() != ']') {
                        println("no")
                        continue@loop
                    }
                }
                ')' ->  {
                    if(stack.isEmpty() || stack.pop() != ')') {
                        println("no")
                        continue@loop
                    }
                }
                '.' -> break
                else -> {}
            }
        }
        if(stack.isEmpty()) println("yes")
        else println("no")
    }
}