package com.example.alogrithems

import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

/**
 * 2023-02-06
 * pureum
 */
@OptIn(ExperimentalTime::class)
fun main(){
    var mark = TimeSource.Monotonic.markNow()
    Thread.sleep(2000)
    println(mark.elapsedNow())
}
