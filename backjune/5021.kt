package com.example.alogrithems.backjune

fun main(){
    val maker = mutableMapOf<String, Int>()
    var inputList = mutableListOf<List<String>>()
    var map = mutableMapOf<String, Double>()
    val (n,m) = readln().split(" ").map { it.toInt() }
    val king = readln()

    // 값 저장 로직
    repeat(n){
        inputList.add(readln().split(" "))
    }

    inputList.map { it.slice(1..2) }
        .forEach {
            it.forEach {
                map[it] = map.getOrDefault(it, 0.0)
            }
        }
    inputList.map { it.first() }
        .forEach {
            map.remove(it)
        }
    map[king] = 1.0

    // 나머지 관계를 차례로 정렬하는 로직
    while(inputList.isNotEmpty()){
        for(i in inputList.indices){
            val child = inputList[i][0]
            val left = inputList[i][1]
            val right = inputList[i][2]
            if(map[left] == null || map[right] == null) continue
            map[child] = map.getOrDefault(child, (map[left]!! + map[right]!!)/2)
            inputList.removeAt(i)
            break
        }
    }

    val compareList = mutableListOf<String>()
    repeat(m){
        compareList.add(readln())
    }
    var sum = 0.0
    var name = ""
    compareList.forEach{
        if((map[it] ?: 0.0) >= sum) {
            sum = map[it]!! ?: 0.0
            name = it
        }
    }
    println(name)
}