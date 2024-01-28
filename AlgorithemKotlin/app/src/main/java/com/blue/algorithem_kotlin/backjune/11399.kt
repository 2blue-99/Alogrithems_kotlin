package com.blue.algorithem_kotlin.backjune

fun main() {
    // 사람들이 줄지어 서 있을 때 각 사람이 돈을 인출하는데 필요한 최솟값을 구하라
    // 시간이 긴 사람이 먼저 인출하게 되면, 뒤에 있는 사람은 시간이 긴 사람이 인출한 다음 인출해야하기 때문에 시간이 길어짐
    // 따라서 시간이 짧은 사람을 먼저 앞에 세워 계산함
    //  = 그리디?
    val n = readln().toInt()
    val arr = readln().split(" ").map{it.toInt()}.sorted().toIntArray()
    var sum = 0
    var wait = 0
    for(i in arr){
        // 줄지어 있을 때 한 사람의 인출 시간 = 현재까지 대기한 시간 + 내 인출 시간
        sum += i+wait
        wait += i
    }
    println(sum)
}