package com.example.alogrithems

import kotlinx.coroutines.*
import java.lang.IllegalArgumentException

/**
 * 2023-04-05
 * pureum
 */

suspend fun main(){
    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        println("exceptionHandler")
        when (exception) {
            is IllegalAccessException -> println("IllegalAccessException")
            is InterruptedException -> println("InterruptedException")
            is IllegalArgumentException -> println("InterruptedException")
        }
    }
    val defferred = CoroutineScope(exceptionHandler).async(exceptionHandler) {
        println("async")
        throw IllegalArgumentException()
        arrayOf(1,2,3)
    }
//    CoroutineScope(exceptionHandler).launch{
//        val deferred = async {
//            throw IllegalArgumentException()
//            arrayOf(1,2,3)
//        }
//    }
    defferred.await()
    delay(1000)
}