package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val test = LocalDateTime.now()
    println(test)
}