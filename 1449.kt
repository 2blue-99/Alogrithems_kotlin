package com.example.alogrithems

/**
 * 2023-04-14
 * pureum
 */

fun main(){
    var (num, len) = readln().split(" ").map { it.toInt() }
    var myArray = Array(2001){0}
    var myList = readln().split(" ").map { it.toInt() }
    for(i in myList){ myArray[i] = 1 }
    var max = myList.max()
    var count = 1
    var dap = 0
    while(count <= max){
        if(myArray[count] == 1){
            dap++
            count += len
        }else{
            count++
        }
    }
    println(dap)
}
