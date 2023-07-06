package com.example.alogrithems

import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.math.BigInteger
import kotlin.math.max

fun main() {
    var result = BigInteger.ONE
    repeat(29){
        result *= BigInteger.valueOf((it+1).toLong())
    }
    println(result)
}
