package com.example.alogrithems

/**
 * 2023-11-22
 * pureum
 */

// 각 자리의 수마다 조건 부합 되는 것들 배열에 넣기
// N 자리 검사할때 N-1 인덱스의 값에다 0과 1을 붙여서 부합되면 N 인덱스 배열에 넣기

// 1 이상 크고 90 이하의 N값
// 이친수 조건 1 : 맨 왼쪽에 0이 오면 안됨
// 이친수 조건 2 : 11이 반복되면 안됨.

fun main(){
    var arr = LongArray(91){ 0L }
    arr[1] = 1
    arr[2] = 1
    var input = readln().toInt()
    for(i in 2..input){
        arr[i] = arr[i-1] + arr[i-2]
    }
    println(arr[input])
}

//for(i in 2..input){
//    for(k in arr[i-1]){
//        arr[i].add(k.last()+"0")
//        val gap = k.last() + "1"
//        if(gap != "11")
//            arr[i].add(gap)
//    }
//}