package com.example.alogrithems.test

import java.util.LinkedList
import java.util.Queue

/**
 * 2023-11-18
 * pureum
 */

fun main() {

    val list2 = listOf("c","z")

    val list = mutableListOf(
        listOf("a","b","c"),
        listOf("d","c","z"),
        listOf("f","g","z"),
        listOf("h","i","a"),
        listOf("h","i","n"),
    )

    val result = list2.flatMap { element ->
        list.filter { sublist ->
            sublist.contains(element)
        }
    }

    println(result)
}