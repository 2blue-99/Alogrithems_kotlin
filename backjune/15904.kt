package com.blue.algorithem_kotlin.backjune

import java.util.*

fun main(){
    val list = listOf('U','C','P','C')
    var index = 0
    val input = readln()
    input.forEachIndexed { idx, it ->
        if(it==list[index]){
            index++
        }
        if(index == 4) {
            println("I love UCPC")
            return
        }
        if(idx == input.length-1)
            println("I hate UCPC")
    }
}