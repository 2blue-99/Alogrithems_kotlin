package com.example.alogrithems.backjune

import java.lang.Exception
import java.lang.Math.min

/**
 * 2023-03-16
 * pureum
 */

fun main(){
    val num = readln().toInt()
    val scoR = Array(num+1){0}
    val scoG = Array(num+1){0}
    val scoB = Array(num+1){0}

    val hapR = Array(num+1){ 0 }
    val hapG = Array(num+1){ 0 }
    val hapB = Array(num+1){ 0 }
    for(i in 1..num){
        val gap = readln().split(" ").map { it.toInt() }
        scoR[i] = gap[0]
        scoG[i] = gap[1]
        scoB[i] = gap[2]
    }

    for( i in 1..num){
        hapR[i] = min(hapG[i-1], hapB[i-1]) + scoR[i]
        hapG[i] = min(hapR[i-1], hapB[i-1]) + scoG[i]
        hapB[i] = min(hapR[i-1], hapG[i-1]) + scoB[i]
    }
    println(min(min(hapR[num], hapG[num]), hapB[num]))
}