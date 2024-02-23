package com.blue.algorithem_kotlin.backjune

import java.util.Stack

fun main() {
    repeat(readln().toInt()){
        var vps = true
        val stack = java.util.Stack<Char>()
        val input = readln().toList()
        input.forEach{
            when(it){
                '(' -> stack.push(it)
                else -> {
                    if(stack.isEmpty()) {
                        vps = false
                        return@forEach
                    }
                    stack.pop()
                }
            }
        }
        if(vps && stack.isEmpty())
            println("YES")
        else
            println("NO")
    }
}