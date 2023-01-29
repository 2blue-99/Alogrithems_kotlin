package com.example.alogrithems

/**
 * 2023-01-03
 * pureum
 */

fun main() {
    var a = readln().toInt()
    val b = readln().toInt()
    var sum = 0
    var min = 0
    while(a!=b+1){
        if(a==1) {
            a++
            continue
        }
        var i =2
        while(true){
            if(a % i == 0 && a != i) break
            if(a/2+1 <= i) {
                sum += a
                if(min==0) min = a
                break
            }
            i++
        }
        a++
    }
    if(sum==0) println(-1)
    else{ println("$sum\n$min") }
}
