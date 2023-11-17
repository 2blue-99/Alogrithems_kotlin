package com.example.alogrithems.backjune

/**
 * 2023-03-30
 * pureum
 */

fun main(){
    var gapList = readln().replace("-", " - ").replace("+"," + ").split(" ")
    var change = false
    var plus=0
    var minus=0
    for( gap in gapList){
        if(gap=="+" || gap =="-"){
            if(gap=="-") change = true
        }else{
            if(!change) plus+=gap.toInt()
            else minus+=gap.toInt()
        }
    }
    println(plus-minus)
}