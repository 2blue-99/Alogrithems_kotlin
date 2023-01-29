package com.example.alogrithems

/**
 * 2023-01-27
 * pureum
 */
fun main(){
    var gap = readln().toInt()
    var count=2
    val list = arrayListOf<Int>()
    while(gap!=1){
        var sosuCount = 2
        var ok = 0
        if(gap%count==0){
            while(true){
                if(count%sosuCount==0 && count==sosuCount) {
                    ok+=1
                    break
                }else if(count%sosuCount==0) break
                sosuCount++
            }
            if(ok==1){
                list.add(count)
                gap /= count
            }
        }else{ count++ }
    }
    list.forEach { println(it) }
}