package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

/**
 * 2023-04-04
 * pureum
 */
fun main(){
    var all = readln().toInt()
    repeat(all){
        readln().toInt()
        var myList = readln().split(" ").map { it.toInt() }.toMutableList()
        var sortedList = myList.sortedDescending().toMutableList()
        var sortCount=0
        var hap = 0
        var dap = 0
        var count = 0
        for( i in myList){
            if(i == sortedList[sortCount]){
                dap += (i*count)-hap
                hap = 0
                count = 0
                sortedList.remove(i)
            }else{
                sortedList.remove(i)
                hap+=i
                count++
            }
        }
        println(dap)
    }
}