package com.example.alogrithems

/**
 * 2023-02-01
 * pureum
 */

fun main() {
    var inputList = arrayListOf<List<String>>()
    var aList = arrayListOf<List<String>>()
    var bList = arrayListOf<List<String>>()
    var (n, m) = readln().split(" ").map { it.toInt() }
    for(i in 1..n) inputList.add(readln().chunked(1))
    println(inputList)

    var dap = 0
    var change=true
    var count = 0
    var index:Int
    var myList = arrayListOf<Int>()
    for(z in 1..(m-8)) {
        for (i in inputList) {
            index = 0
            for (a in count until count + 8) {
                if (change) {
                    if (i[a%8] != "W") dap++
                } else {
                    if (i[a%8] != "B") dap++
                }
                change = !change
                index++
            }
            change = !change
        }
        myList.add(dap)
        println(myList)
        count++
        dap = 0
    }
}