package com.example.alogrithems

import java.math.BigInteger

/**
 * 2023-03-06
 * pureum
 */

//val myList = Array(31){i -> BigInteger("0")}

fun main(){
    val num = readln().toInt()
    for( i in 1..num) {
        val (r, n) = readln().split(" ").map { it.toInt() }
        println(nCr(n,r))
    }
}

fun nCr(n:Int, r:Int):BigInteger{
    return fac(n) / (fac(n-r) * fac(r))
}

fun fac(gap:Int):BigInteger{
//    if(myList[gap] != BigInteger("0") ) return myList[gap]
    var hap= BigInteger("1")
    for(i in 1..gap) { hap *= i.toBigInteger() }
//    myList[gap] = hap
    return hap
}

