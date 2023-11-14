package com.example.alogrithems

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

/**
 * 2023-10-17
 * pureum
 */
fun simple(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(100) // 무엇가 의미있는 작업을 해서 지연되는 척
        emit(i) // 다음 값 배출
    }
}
fun main() = runBlocking<Unit> {
    // 메인 스레드를 차단하지는 확인하기 위한 용도의 코루틴 luanch
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Flow 결과를 수집한다
    simple().collect(::println)
}