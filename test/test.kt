package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val now = LocalDate.now()
    val gap = LocalDate.now().plusYears(7)
    val new = LocalDate.parse("1999-01-01")
    println(new)
}
