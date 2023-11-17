package com.example.alogrithems.backjune

/**
 * 2023-09-23
 * pureum
 */
fun main(){
    val gap = readln().toInt()
    var fNum = gap/5
    var count = 0
    if(gap == fNum*5) println(fNum)
    else {
        while (fNum >= 0) {
            if ((gap - 5 * fNum) % 3 == 0) {
                count = fNum + ((gap - 5 * fNum) / 3)
                break
            }
            fNum--
        }
        if (count != 0) println(count)
        else println(-1)
    }
}