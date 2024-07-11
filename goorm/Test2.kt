package com.blue.algorithem_kotlin.goorm

fun main(){
    // [문제 정리]
    // 예술품이 1~N번째까지 진열되어 있고
    // 개당 가격은 1 ~ 10^9
    // 임의의 수 a번째부터 b번째까지 모든 예술품을 구매하려고 함
    // 총 합의 최소 금액이 L, 최대 금액이 R이라 할 떄
    // 조건을 만족하는 a,b 쌍의 개수를 구하라

    // [입력]
    // 개수 N, 최소 L, 최대 R
    // 금액 리스트

    // [풀이]
    // 이중 포문으로 완전탐색

    // 입력값을 받는 부분
    val (n,l,r) = readln().split(" ").map { it.toInt() }
    val moneyList = readln().split(" ").map { it.toInt() }
    // 해당하는 쌍의 개수 카운트
    var count = 0

    // 반복문을 통해 index를 증가시키며, i ~ k 까지 금액의 합을 계산
    for(i in 0 until n){
        for(k in i until n){
            val sum = moneyList.slice(i..k).sumOf { it }
            // 합이 제시된 범위에 포함하면 count 증가
            if(sum in l..r)
                count++
            // 만약 최대 범위를 넘을 경우 break을 통해 불필요한 연산 방지
            else if(sum > r)
                break
        }
    }
    println(count)
}