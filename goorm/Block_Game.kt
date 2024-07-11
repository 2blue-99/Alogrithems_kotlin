package com.blue.algorithem_kotlin.goorm

import java.util.*

fun main(args: Array<String>) {

    val input = readLine()!!.toInt()
    val directionList = readLine()!!.toList()
    val scoreList = listOf(1)+readLine()!!.split(" ").map{it.toInt()}
    var score = 1
    val postionStack: Stack<String> = Stack()
    val scoreStack: Stack<Int> = Stack()
    var index = 1

    // 시작 위치
    var (a,b) = listOf(0,0)
    postionStack.push("$a $b")
    scoreStack.push(1)


    for(i in directionList.indices){
        if(directionList[i] == 'L'){
            b-=1
        }else if(directionList[i] == 'R'){
            b+=1
        }else if(directionList[i] == 'U'){
            a-=1
        }else if(directionList[i] == 'D'){
            a+=1
        }

        if(postionStack.contains("$a $b")){
            while(true){
                val p = postionStack.pop()
                val s = scoreStack.pop()
                score-=s
                if(p == "$a $b") break
            }
        }

        score += scoreList[index]
        postionStack.add("$a $b")
        scoreStack.add(scoreList[index])
        index++
    }

    println(score)
}

//fun main(args: Array<String>) {
//
//    val input = readLine()!!.toInt()
//    val directionList = readLine()!!.toList()
//    val rankList = readLine()!!.split(" ").map{it.toInt()}
//    val arr = Array(input*2+1){IntArray(input*2+1)}
//    var rank = 1
//    val stack: Stack<Triple<Int, Int, Int>> = Stack()
//    var currentIndex = 1
//
//    // 시작 위치
//    var (a,b) = listOf(input+1,input+1)
//    arr[a][b] = 1
//    stack.push(Triple(a,b,1))
//
//    fun back(cnt: Int){
//        repeat(cnt){
//            val (ca,cb,cRank) = stack.pop()
//            arr[ca][cb] = 0
//            rank-=cRank
//            currentIndex--
//        }
//    }
//
//    for(i in directionList.indices){
//        if(directionList[i] == 'L'){
//
//            if(arr[a][b-1] != 0) back(currentIndex - arr[a][b-1] + 1)
//            b-=1
//
//        }else if(directionList[i] == 'R'){
//
//            if(arr[a][b+1] != 0) back(currentIndex - arr[a][b+1] + 1)
//            b+=1
//
//        }else if(directionList[i] == 'U'){
//
//            if(arr[a-1][b] != 0) back(currentIndex - arr[a-1][b] + 1)
//            a-=1
//
//        }else if(directionList[i] == 'D'){
//            if(arr[a+1][b] != 0) back(currentIndex-arr[a+1][b] + 1)
//            a+=1
//        }
//
//        currentIndex++
//        arr[a][b] = currentIndex
//        rank+=rankList[i]
//        stack.add(Triple(a,b,rankList[i]))
//
//    }
//
//    print(rank)
//}