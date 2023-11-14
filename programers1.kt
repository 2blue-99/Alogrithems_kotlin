package com.example.alogrithems

/**
 * 2023-11-14
 * pureum
 */

fun main(){
    val alphaList = listOf("zero","one","two","three","four","five","six","seven","eight","nine","0","1","2","3","4","5","6","7","8","9")
    var input = readln()

    for(i in alphaList)
        input = input.replace(i, "$i ")

    println(input)

    var output = ""
    for(i in input.split(" ")){
        when(i){
            "zero" -> output += "0"
            "one" -> output += "1"
            "two" -> output += "2"
            "three" -> output += "3"
            "four" -> output += "4"
            "five" -> output += "5"
            "six" -> output += "6"
            "seven" -> output += "7"
            "eight" -> output += "8"
            "nine" -> output += "9"
            else -> output += i
        }
    }
    output.toInt()
    println(output)
}