package com.example.alogrithems

import kotlinx.coroutines.*
import kotlin.math.max

suspend fun main() {
    val supervisor = SupervisorJob()

    CoroutineScope(Dispatchers.IO).launch {
        val one = launch(Dispatchers.IO + supervisor ) {

        }

    }.join()
}

