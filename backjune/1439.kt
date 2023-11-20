package com.example.alogrithems.backjune

/**
 * 2023-11-20
 * pureum
 */

fun main() {
    var input = readln()
    var index = 0
    var countOne = 0
    var countZero = 0
    while (index < input.length) {
        if (input[index] == '0') {
            while(true){
                index++
                if(index == input.length || input[index] != '0') { break }
            }
            countZero++
        }else if(input[index] == '1'){
            while(true){
                index++
                if(index == input.length || input[index] != '1' ) { break }
            }
            countOne++
        }
        if(index+1 == input.length) {
            if(input[index] == '0' ) countZero++
            else countOne++
            break
        }
    }
    println(if(countZero> countOne) countOne else countZero)
}