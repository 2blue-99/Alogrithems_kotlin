//package com.example.alogrithems
//
//import kotlin.system.exitProcess
//
///**
// * 2023-08-01
// * pureum
// */
//fun main() {
//    var (N, L) = readln().split(" ").map { it.toInt() }
//    if(N==0) {
//        println(-1)
//        exitProcess(0)
//    }
//    while (true){
//        //홀수
//        if (N % L == 0.0) {
//            var gap = L/2
//            for(i in N/L-gap..N/L+gap){
//                print("$i ")
//            }
//            exitProcess(0)
//        }
//        //짝수
//        else if (N % L == L / 2) {
//            var gap = L/2 // 4/2 = 2
//            for(i in N/L-gap+1..N/L+gap)
//                print("$i ")
//                exitProcess(0)
//        }
//        else {
//            L++
//            if(L>100){
//                println(-1)
//                exitProcess(0)
//            }
//        }
//    }
//}