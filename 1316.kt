package com.example.alogrithems

/**
 * 2023-01-12
 * pureum
 */
fun main(){
    val repeat = readln().toInt()
    var count=0
    for(i in 1..repeat){
        var check=0
        val alpha = readln()
        if(alpha.length==1) {
            count++
            continue
        }
        var before=alpha.first()
        for((index,now) in alpha.slice(1 until alpha.length).withIndex()){
            if(before != now ){
                if(alpha.indexOf(before, index+1) != -1){
                    check = -1
                    break
                }
            }
            before = now
        }
        if(check!=-1) count++
    }
    println(count)
}