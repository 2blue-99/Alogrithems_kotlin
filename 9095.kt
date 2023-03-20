package com.example.alogrithems

/**
 * 2023-03-19
 * pureum
 */
fun main(){
    val num = readln().toInt()
    val myArray = Array(11){0}
    myArray[1] = 1
    myArray[2] = 2
    myArray[3] = 4
    for( i in 4..10){ myArray[i] = myArray[i-1] + myArray[i-2] + myArray[i-3] }
    repeat(num) { println(myArray[readln().toInt()]) }
}