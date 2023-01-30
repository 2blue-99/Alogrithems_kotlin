package com.example.alogrithems

/**
 * 2023-01-30
 * pureum
 */
fun main() {
    val num = readln().toInt()
    var start=0
    if(num-num.toString().chunked(1).size <= 0){
        start = num - (9 * num.toString().chunked(1).size)
    }else{
        start = num - (9 * (num.toString().chunked(1).size-1))
    }

    if (num < 10) println(num / 2)
    else {
        while (true) {
            val list = start.toString().chunked(1)
            var hap = 0
            list.forEach { hap += it.toInt() }
            if (hap + list.joinToString("").toInt() == num) {
                println(list.joinToString("").toInt())
                break
            }
            if (list.joinToString("").toInt() > num) {
                println(0)
                break
            }
            start++
        }
    }
}