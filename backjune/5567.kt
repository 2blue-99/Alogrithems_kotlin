package com.blue.algorithem_kotlin.backjune

fun main() {
    val n = readln().toInt()
    val list = Array(n+1){mutableListOf<Int>()}
    val vArr = BooleanArray(n+1)
    var result = 0
    repeat(readln().toInt()){
        val (from,to) = readln().split(" ").map { it.toInt() }
        list[from].add(to)
        list[to].add(from)
    }

    fun bfs(num: Int, cnt: Int){
        if(cnt==2) return
        for(i in list[num]){
            if(!vArr[i]) {
                result++
                vArr[i] = true
            }
            bfs(i,cnt+1)
        }
    }
    bfs(1,0)
    if(result == 0)
        println(0)
    else
        println(result-1)
}