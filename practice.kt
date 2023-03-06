package com.example.alogrithems

fun main() {
    val a = listOf(readLine()!!, readLine()!!)
    var b = MutableList(16) {a[it%2][it/2]-'0'}
    repeat(14) { b = MutableList(b.size-1) {(b[it] + b[it+1]) % 10} }
    println(b.joinToString(""))
}

