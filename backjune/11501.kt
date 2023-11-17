package com.example.alogrithems.backjune

/**
 * 2023-04-04
 * pureum
 */

fun main() {
    var all = readln().toInt()
    repeat(all) {
        readln().toInt()
        var myList = readln().split(" ").map { it.toInt() }.reversed().toMutableList()
        var max = myList.first()
        var count = 0
        var total = 0L
        var part = 0
        for (now in 1..myList.lastIndex) {
            if (myList[now] < max) {
                count++
                part = part - myList[now] + max
            } else if (myList[now] == max) {
                total += part.toLong()
                part = 0
                count = 0
            }else{
                max = myList[now]
            }
        }
        total+=part.toLong()
        println(total)
    }
}