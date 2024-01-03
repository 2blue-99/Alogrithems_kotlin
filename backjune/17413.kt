package com.example.alogrithems.backjune

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = br.readLine()
    var tag = false
    var sum = ""
    var temp = ""
    for(i in input){
        if(i == '<') {
            sum += temp.reversed()
            temp = ""
            tag = true
            sum+='<'
            continue
        }
        if(i == '>') {
            tag = false
            sum+='>'
            continue
        }
        if(tag) sum+=i
        else {
            if(i == ' '){
                sum += temp.reversed()
                temp=""
                sum +=i
            }else{
                temp+=i
            }
        }
    }
    bw.write(sum+temp.reversed())
    bw.flush()
    bw.close()
}