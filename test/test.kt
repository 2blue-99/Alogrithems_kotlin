package com.example.alogrithems.test

/**
 * 2023-11-18
 * pureum
 */

fun main() {

    var list = arrayOf(1,1,1,2,3,4,5)
    val two = list.copyOf()

    println(list.contentToString())
    println(two.contentToString())

    list[0] = 999

    println(list.contentToString())
    println(two.contentToString())

}