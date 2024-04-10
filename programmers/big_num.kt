package com.blue.algorithem_kotlin.programmers

fun main() {
    val temp = intArrayOf(4,41,355)
    val list = mutableListOf<String>()

    temp.forEach { list.add(it.toString()) }
    list.sortedWith{ a, b ->
        when{
            a.length==b.length -> b.compareTo(a)
            else -> (b+a).compareTo(a+b)
        }
    }
    println(list)
}
