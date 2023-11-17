package com.example.alogrithems.backjune

/**
 * 2023-02-22
 * pureum
 */

fun main(){
    var hap = 0.0
    var count = 0
    var gap = 0.0
    for(i in 1..20){
        val dap = readln().split(" ")
        val hak = dap[1].toDouble()
        if(dap.last() == "P") continue
        gap+=hak
        when(dap.last()){
            "A+" -> hap+=4.5 * hak
            "A0" -> hap+=4.0 * hak
            "B+" -> hap+=3.5 * hak
            "B0" -> hap+=3.0 * hak
            "C+" -> hap+=2.5 * hak
            "C0" -> hap+=2.0 * hak
            "D+" -> hap+=1.5 * hak
            "D0" -> hap+=1.0 * hak
            else -> hap+=0.0
        }
    }
    println(hap/gap)
}