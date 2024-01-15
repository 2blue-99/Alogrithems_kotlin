package com.example.alogrithems.backjune


//fun main(){
//    val gap = readln().toInt()
//    fun recursion(n: Int): Int {
//        if(n <= 2) return 1
//        return recursion(n-1) + recursion(n-2)
//    }
//    println(recursion(gap))
//}

fun main(){
    val gap = readln().toInt()
    val arr = Array(gap+1){0L}
    fun recursion(n: Int): Long {
        if(n <= 2) return 1
        if(arr[n] != 0L){
            return arr[n]
        }else{
            arr[n] = recursion(n-1) + recursion(n-2)
            return arr[n]
        }
    }
    println(recursion(gap))
}

//fun main(){
//    val gap = readln().toInt()
//    val arr = Array(gap+1){0L}
//    fun recursion(n: Int): Long {
//        if(n==1 || n==2) return 1L
//        var gap1 = 0L
//        var gap2 = 0L
//        if(arr[n-2]!=0L) gap1 = arr[n-2]
//        else gap1 = recursion(n-2)
//
//        if(arr[n-1]!=0L) gap2 = arr[n-1]
//        else gap2 = recursion(n-1)
//
//        arr[n] = gap1 + gap2
//        return arr[n]
//    }
//    println(recursion(gap))
//}