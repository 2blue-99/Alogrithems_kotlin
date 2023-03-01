package com.example.alogrithems

/**
 * 2023-03-01
 * pureum
 */

fun main(){
    val timeList = ArrayList<Int>()
    val payList = ArrayList<Int>()
    var today=0
    var myToday=0
    var next=0
    var money = 0
    var maxMoney = 0
    var nums = readln().toInt()
    for( i in 0 until nums){
        val (time,pay) = readln().split(" ").map { it.toInt() }
        timeList.add(time)
        payList.add(pay)
    }

    for(i in 0 until nums){
        today = i
        myToday = today
        while(true){
            today += timeList[today]
            if(today>nums) {
                if(maxMoney<money) maxMoney = money
                today=myToday+1
                continue
            }
            money += payList[today]
        }
    }
}