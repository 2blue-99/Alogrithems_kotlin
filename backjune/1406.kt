package com.example.alogrithems.backjune

import java.util.*

/**
 * 2023-12-12
 * pureum
 */
fun main(){
    //맨 처음에 커서는 문장 맨 뒤에 위치
    val list = LinkedList<Char>()
    for(i in readln()) list.add(i)
    val cursor = list.listIterator(list.size)
    repeat(readln().toInt()){
        when(val command = readln()){
            "L" -> {
                if(cursor.hasPrevious())
                    cursor.previous()
            }
            "D" -> {
                if(cursor.hasNext())
                    cursor.next()
            }
            "B" -> {
                if(cursor.hasPrevious()) {
                    cursor.previous()
                    cursor.remove()
                }
            }
            else -> {
                cursor.add(command.last())
            }
        }
    }
    println(list.joinToString(""))
}
