package com.example.alogrithems

/**
 * 2023-11-14
 * pureum
 */
private lateinit var intArr : IntArray
private var target : Int = 0
private var myCount = 0
private var pureumCount = 0
fun main(){
    intArr = intArrayOf(1, 1, 1, 1, 1,1, 1, 1, 1, 1,1, 1, 1, 1, 1,1, 1, 1, 1, 1)
    target = 3
    dfs(0,0)
    println(myCount)
    println("푸름 : $pureumCount")
}

fun dfs(index: Int, hap: Int){
    pureumCount++
    if(index== intArr.size) {
        if(hap == target)
            myCount++
        return
    }
    dfs(index + 1, hap + intArr[index])
    dfs(index + 1, hap - intArr[index])
}