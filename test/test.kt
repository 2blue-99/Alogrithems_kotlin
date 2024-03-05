package com.blue.algorithem_kotlin.test

fun main() {
    val index = 8
    when (index) {
        1, 2, 4, 5 -> {
            println("1,2,4,5")
        }
        3, 6 -> {
            println("3,6")
        }
        7, 8 -> {
            println("7,8")
        }
        9 -> {
            println("9")
        }
    }
}