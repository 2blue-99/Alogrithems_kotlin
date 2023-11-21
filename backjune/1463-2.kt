package com.example.alogrithems.backjune

/**
 * 2023-11-21
 * pureum
 */
fun main(){
    // %3 == 0 , %2 == 0 , - 1
    // 각각의 조건에서 계산한 값을 dapArr 인덱스에 카운터 넣기
    // dapArr[n] 이 0이 아니라면 현재까지의 카운터와 인덱스의 카운터를 비교해서 작을경우 바꾸기
    // while

    var dapArr = Array(10000001){10000001}
    var input = readln().toInt()
    dapArr[input] = 0

    for( i in input downTo 1){
        if(i % 3 == 0) {
            if(dapArr[i/3] > dapArr[i] + 1)
                dapArr[i/3] = dapArr[i] + 1
        }
        if(i % 2 == 0) {
            if(dapArr[i/2] > dapArr[i] + 1)
                dapArr[i/2] = dapArr[i] + 1
        }

        if(dapArr[i-1] > dapArr[i]+1)
            dapArr[i-1] = dapArr[i] + 1
    }
    println(dapArr[1])
}