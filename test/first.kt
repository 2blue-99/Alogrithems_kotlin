package com.example.alogrithems.test

/**
 * 2023-11-25
 * pureum
 */

fun main(){
    val nameArr = arrayOf("joy", "brad", "alessandro", "conan", "david")
    val giftArr = arrayOf("alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david")
    val giveMap = mutableMapOf<String, Int>()
    val getMap = mutableMapOf<String, Int>()
    val jisuMap = mutableMapOf<String, Int>()
    val getListMap = mutableMapOf<String, MutableList<String>>()
    val resultMap = mutableMapOf<String, Int>( )

    for(name in nameArr){
        giveMap[name] = 0
        getMap[name] = 0
        jisuMap[name] = 0
        resultMap[name] = 0
        getListMap[name] = mutableListOf()
    }

    for(list in giftArr){
        val (give,get) = list.split(" ")
        giveMap[give] = giveMap[give]!! + 1
        getMap[get] = getMap[get]!! + 1
        getListMap[get]!!.add(give)
    }

    for(name in nameArr)
        jisuMap[name] = giveMap[name]!! - getMap[name]!!


    println(getListMap)

    var otherList = nameArr.copyOf().toList()
    for(name in nameArr){

        otherList = otherList - name

        for(other in otherList){

            val list = getListMap[name]
            if(list!!.contains(other)) {
                // 선물을 주고 받았던 경우
                var getCount = list.count { it == other }
                var giveCount = getListMap[other]!!.count { it == name }

                if (getCount > giveCount) {
                    resultMap[other] = resultMap[other]!! + 1
                    continue
                }
                else if (getCount < giveCount) {
                    resultMap[name] = resultMap[name]!! + 1
                    continue
                }
            }
            //선물을 주고 받지 않았던 경우
            if (jisuMap[name]!! > jisuMap[other]!!)
                resultMap[name] = resultMap[name]!! + 1
            else if (jisuMap[name]!! < jisuMap[other]!!)
                resultMap[other] = resultMap[other]!! + 1

        }
    }

    println(resultMap)

    println(resultMap.values.max())
}

//class Solution {
//
//    fun solution(friends: Array<String>, gifts: Array<String>): Int {
//
//        val nameArr = friends.copyOf()
//        val giftArr = gifts.copyOf()
//        val giveMap = mutableMapOf<String, Int>()
//        val getMap = mutableMapOf<String, Int>()
//        val jisuMap = mutableMapOf<String, Int>()
//        val getListMap = mutableMapOf<String, MutableList<String>>()
//        val resultMap = mutableMapOf<String, Int>()
//
//        // map 초기화
//        for(name in nameArr){
//            giveMap[name] = 0
//            getMap[name] = 0
//            jisuMap[name] = 0
//            resultMap[name] = 0
//            getListMap[name] = mutableListOf()
//        }
//
//        // 주고 받은 선물 카운팅
//        for(list in giftArr){
//            val (give,get) = list.split(" ")
//            giveMap[give] = giveMap[give]!! + 1
//            getMap[get] = getMap[get]!! + 1
//            getListMap[get]!!.add(give)
//        }
//
//        // 선물 지수 계산
//        for(name in nameArr)
//            jisuMap[name] = giveMap[name]!! - getMap[name]!!
//
//        // 다음달 주고받을 선물 계산
//        var otherList = nameArr.copyOf().toList()
//        for(name in nameArr){
//
//            otherList = otherList - name
//
//            for(other in otherList){
//
//                val list = getListMap[name]
//
//                // 선물을 주고 받았던 경우
//                if(list!!.contains(other)) {
//
//                    var getCount = list.count { it == other }
//                    var giveCount = getListMap[other]!!.count { it == name }
//
//                    if (getCount > giveCount) {
//                        resultMap[other] = resultMap[other]!! + 1
//                        continue
//                    }
//                    else if (getCount < giveCount) {
//                        resultMap[name] = resultMap[name]!! + 1
//                        continue
//                    }
//                }
//                // 주고받은 횟수가 같거나, 선물을 주고 받지 않았던 경우
//                if (jisuMap[name]!! > jisuMap[other]!!)
//                    resultMap[name] = resultMap[name]!! + 1
//                else if (jisuMap[name]!! < jisuMap[other]!!)
//                    resultMap[other] = resultMap[other]!! + 1
//            }
//        }
//
//        // 가장 큰 결과 출력
//        var max = 0
//        for( i in resultMap.values){
//            if(i > max)
//                max = i
//        }
//        return max
//    }
//}