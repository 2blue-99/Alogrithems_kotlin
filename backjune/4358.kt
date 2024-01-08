package com.example.alogrithems.backjune

fun main(){
    // 각 종이 전체에서 몇 %를 차지할까
    // 입력에는 최대 10,000개종, 최대 1,000,000 그루의 나무 주어짐

    // 각 종의 이름을 사전순으로 출력
    // 종의 비율을 백분율 소수 4째 자리까지 반올림

    val map = mutableMapOf<String,Double>()
    var sum = 0
    while(true){
        val input = readlnOrNull() ?: break
        if(input=="") break
        map[input] = map.getOrDefault(input, 0.0)+1
        sum++
    }
    map.toList().sortedBy { it.first }.forEach {
        println("${it.first} ${String.format("%.4f",it.second/sum*100)}")
    }
}