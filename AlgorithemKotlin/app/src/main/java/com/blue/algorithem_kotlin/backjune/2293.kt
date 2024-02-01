package com.blue.algorithem_kotlin.backjune

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.TimeZone

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val currentTimeUTC = LocalDateTime.now(ZoneId.of("UTC"))
    println("현재 시간(UTC): $currentTimeUTC")

    repeat(1){
        val currentTimeSeconds = Instant.now().toEpochMilli()
        println("현재 Unix 시간: $currentTimeSeconds")
    }

    println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssms")))
}


//fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val (n,k) = readln().split(" ").map { it.toInt() }
//    val arr = IntArray(n){ br.readLine().toInt() }
//    var cnt = 0
//
//    fun bt(sum: Int, start: Int){
//        if(sum==k) {
//            cnt++
//            return
//        }
//        for(i in start until n){
//            if(sum+arr[i]>k) continue
//            bt(sum+arr[i],i)
//        }
//    }
//    bt(0,0)
//    println(cnt)
//}