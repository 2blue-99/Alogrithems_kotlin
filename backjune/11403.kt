package com.blue.algorithem_kotlin.backjune

fun main(){
    val n = readln().toInt()
    val arr = Array(n){ readln().split(" ").map { it.toInt() }.toIntArray() }
    repeat(n){ k ->
        repeat(n){ i ->
            repeat(n){ j ->
                if(arr[i][j] == 0 && arr[i][k] == 1 && arr[k][j] == 1)
                    arr[i][j] = 1
            }
        }
    }
    arr.forEach { println(it.joinToString(" ")) }
}