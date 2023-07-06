package com.example.alogrithems

import java.math.BigInteger

val myArray1010 = Array<BigInteger>(31){BigInteger.ZERO}

fun main(){
    repeat(readln().toInt()){
        val (a,b) = readln().split(" ").map { it.toInt() }
        println(combination(b,a))
    }
}

fun combination(a:Int, b:Int):BigInteger{
    return if(a == b) BigInteger.ONE
    else if(b == 0) BigInteger.ONE
    else if(b == 1) BigInteger.valueOf(a.toLong())
    else factorial(a) / (factorial(a-b) * factorial(b))
}

fun factorial(num: Int):BigInteger{
    var result = BigInteger.ONE
    return if(myArray1010[num] == BigInteger.ZERO) {
        repeat(num) {
            result *= BigInteger.valueOf((it + 1).toLong())
            myArray1010[it+1] = result
        }
        result
    }else{
        myArray1010[num]
    }
}