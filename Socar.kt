package com.example.alogrithems

/**
 * 2023-04-25
 * pureum
 */

fun main(){
    val xArray = Array(1_000_000){0}
    val yArray = Array(1_000_000){0}
    val myArray = arrayListOf<MutableList<Int>>()
    val input = readln()
    input.slice(1..input.length-2)
        .replace("],","]],")
        .split("],")
        .forEachIndexed { index, it ->
            var gap = it.split(",","[","]").slice(1..4).map { it.toInt() }.toMutableList()
            gap.add(0,index)
            myArray.add(gap)
        }

    myArray.sortBy { it[2] }
    println("for down array : $myArray")

    for(i in 0 until myArray.size){
        var start = myArray[i][1]
        var end = myArray[i][3]
        var nowHeight = xArray.slice(start until end).max()
        var gap = myArray[i][2]-nowHeight
        myArray[i][2] = nowHeight
        myArray[i][4] = myArray[i][4]-gap
        for( k in start until end)
            xArray[k] = myArray[i][4]
    }

    myArray.sortBy { it[1] }
    println("for left array : $myArray")

    for(i in 0 until myArray.size){
        var start = myArray[i][2]
        var end = myArray[i][4]
        var nowHeight = yArray.slice(start until end).max()
        var gap = myArray[i][1]-nowHeight
        myArray[i][1] = nowHeight
        myArray[i][3] = myArray[i][3]-gap
        for( k in start until end)
            yArray[k] = myArray[i][3]
    }
    myArray.sortBy { it.first() }
    myArray.forEach { it.removeAt(0) }
    println(myArray)
    print("[")
    repeat(myArray.size){
        print(myArray[it].toString().replace("[","\"").replace("]","\"").replace(",",""))
        if(it<myArray.size-1) print(",")
    }
    print("]")
}