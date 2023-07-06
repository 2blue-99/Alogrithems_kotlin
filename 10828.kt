package com.example.alogrithems

/**
 * 2023-07-06
 * pureum
 */
var array10828 = Array(10001){-1}
var now = 0
fun main(){
    repeat(readln().toInt()){
        val input = readln().split(" ")
        when(input[0]){
            "push" -> push(input[1].toInt())
            "pop" -> println(pop())
            "size" -> println(size())
            "empty" -> println(empty())
            "top" -> println(top())
        }
    }
}

fun push(num: Int){
    now++
    array10828[now] = num
}


fun pop():Int{
    if(now>0) {
        val gap = array10828[now]
        array10828[now] = -1
        now--
        return gap
    } else return -1
}

fun size():Int{
    return now
}

fun empty():Int{
    return if(now == 0) 1 else 0
}

fun top():Int{
    return if(now>0) array10828[now]
    else -1
}