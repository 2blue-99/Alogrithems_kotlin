package com.blue.algorithem_kotlin.backjune

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val resultList = mutableListOf<Int>()

    fun dfs(num: Int, list: MutableList<Int>) {
        if (list.size == m) {
            list.forEach { print("$it ") }
            println()
            return
        }
        for (i in 1..num) {
            if (list.contains(i)) continue
            val newList = list.toMutableList()
            newList.add(i)
            dfs(num, newList)
        }
    }

    dfs(n, resultList)
}