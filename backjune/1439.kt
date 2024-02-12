package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune



/**
 * 2023-11-20
 * pureum
 */

import kotlin.math.min
fun main() {
    var countOne = 0
    var one = 0
    var countZero = 0
    var zero = 0
    var input = readln()
    input = input.replace("01","0 1").replace("10","1 0")
    var list = input.split(" ")
    for(i in list){
        if(i[0] == '1') {
            countOne += i.length
            one++
        }
        else {
            countZero += i.length
            zero++
        }
    }
    println(min(one,zero))
}

//fun main() {
//    var input = readln()
//    var index = 0
//    var countOne = 0
//    var countZero = 0
//    while (index < input.length) {
//        if (input[index] == '0') {
//            while(true){
//                index++
//                if(index == input.length || input[index] != '0') { break }
//            }
//            countZero++
//        }else if(input[index] == '1'){
//            while(true){
//                index++
//                if(index == input.length || input[index] != '1' ) { break }
//            }
//            countOne++
//        }
//        if(index+1 == input.length) {
//            if(input[index] == '0' ) countZero++
//            else countOne++
//            break
//        }
//    }
//    println(if(countZero> countOne) countOne else countZero)
//}
