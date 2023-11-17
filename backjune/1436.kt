package com.example.alogrithems.backjune

/**
 * 2023-02-06
 * pureum
 */

fun main() {
    val num = readln().toInt()
    var dap = 0
    var sixCount:Int
    var count = "666"
    while (true) {
        sixCount=0
        count.forEach {
            if (it.toString() == "6") {
                sixCount++
                if (sixCount == 3) {
                    dap++
                    return@forEach
                }
            } else { sixCount = 0 }
        }
        if(dap==num) break
        count = (count.toInt()+1).toString()
    }
    println(count)
}
