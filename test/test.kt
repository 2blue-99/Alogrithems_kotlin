package com.blue.algorithem_kotlin.test

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

fun main() {
    val word= "EIO"
    var answer = -1
    var find = false
    val list = listOf("A","E","I","O","U")

    fun bt(w: String){
        println(w)
        if(find) return
        if(w.length > 5) return
        answer++
        if(w == word){
            find = true
            return
        }
        for(i in list){
            bt(w+i)
        }
    }
    bt("")

    println(find)
    println(answer)
}