package com.blue.algorithem_kotlin.backjune

fun main(){
    val (h,w,x,y) = readln().split(" ").map { it.toInt() }
    val arr = Array(h+x){ readln().split(" ").map { it.toInt() } }
    val rArr = Array(h){IntArray(w)}

    repeat(h){ i ->
        repeat(w){ j ->
            rArr[i][j] = arr[i][j]
        }
    }

    for(i in x until h){
        for(j in y until w){
            rArr[i][j] = arr[i][j] - rArr[i-x][j-y]
        }
    }
    rArr.forEach { println(it.joinToString(" ")) }
}