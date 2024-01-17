package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

fun main(){
    // 출석 관리
    // 1. 시작 전 채팅
    // 2. 개강총회 끝부터 스트리밍 끝까지

    // 채팅이 중복될 수 있음

    // s 개강총회 시작 시간
    // e 개강총회 끝난 시간
    // q 개강총희 스트링 끝낸 시간

    // 비교
    // 개강총회 시작 시간까지 채팅 기록 비교
    // 개강총회 끝 이후 스트링 끝까지 기록 비교

    var (s, e, q) = readln().split(" ")
    val start = s.replace(":","")
    val end = e.replace(":","")
    val quit = q.replace(":","")
    val map = hashMapOf<String, Int>()
    while(true){
        val input = readlnOrNull()?.split(" ") ?: break
//        val input = readln().split(" ")
//        if(input.size == 1) break
        val time = input.first().replace(":","")
        val name = input.last()
        if(time <= start)
            map[name] = 1
        else if(time >= end && time <= quit)
            if(map[name]!=null)
                map[name] = map[name]!!.plus(1)
    }
    println(map.count { it.value >= 2 })
}