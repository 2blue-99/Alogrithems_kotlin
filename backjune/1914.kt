package com.example.alogrithems.backjune

import java.io.OutputStreamWriter
import java.math.BigInteger

fun main(){
    val n = readln().toInt()
    var count = 0
    var list = mutableListOf<String>()

    //                 1          2         3
    fun func(n: Int, start: Int, sub: Int, to: Int){
        println("$n, $start, $sub, $to")
        if(n == 0) return
        count+=1
        func(n-1, start, to, sub)
        if(n<=20) list.add("$start $to")
        func(n-1, sub, start, to)
    }

    if(n>20)
        println( BigInteger("2").pow(n).add(BigInteger("-1")).toString())
    else{
        func(n, 1, 2, 3)
        println(count)
        list.forEach { println(it) }
    }
}

//fun main() {
//    val sb = StringBuilder()
//    val n = readLine()!!.toInt()
//    var cnt = 0
//
//    fun hanoi(num: Int, start: Int, sub: Int, to: Int){
//        if (num == 0) return
//        cnt += 1
//        hanoi (num - 1, start, to, sub) // N - 1 개 원반을 시작점 -> sub
//        sb.append("$start $to\n") // n번 째 원반 -> 목표 기둥
//        hanoi(num - 1, sub, start, to) // N-1 개 원반 sub -> to
//    }
//    hanoi(n, 1,2,3)
//    println(cnt)
//    print(sb)
//}