package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-07-26
 * pureum
 */

fun main() {
    var arr = Array(5001) { -1 }

    val (n, k) = readln().split(" ").map { it.toInt() }

    for (i in 1..n) {
        arr[i] = 0
    }

    var now = 0
    var count = 0
    var dap = 0
    var dapList = mutableListOf<Int>()
    var out = StringBuilder()

    out.append("<")
    while (dapList.size<n) {

        count++
        now++



        //배열 사이즈(n)를 넘어갈 경우 처음으로 복귀
        if (now > n) {
            now -= n
        }

        //제거된 배열은 그냥 통과
        if (arr[now] == 1) {
            count--
            continue
        }

        if (arr[now] == 0 && count == k) {
            arr[now] = 1
            out.append("$now")
            if(dap == n-1){
                out.append(">")
                break
            }
            out.append(", ")
            count = 0
            dap++
        }


    }
    println(out)
}