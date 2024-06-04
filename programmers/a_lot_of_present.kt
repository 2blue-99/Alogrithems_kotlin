package com.blue.algorithem_kotlin.programmers

class a_lot_of_present {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        // 선물을 더 많이 준 사람이 다음달 선물 받음
        // 주고받은 기록 X, 똑같이 주고받음 -> 선물지수가 큰 사람이 작은사람에게 선물
        // (선물지수 : 준 선물 개수 - 받은 선물 개수)
        // 선물 지수가 같다면 패스
        // 선물 가장 많이 받을 친구의 선물의 수
        val giveMap = mutableMapOf<String, MutableList<String>>()
        val getMap = mutableMapOf<String, MutableList<String>>()
        val giftScoreMap = mutableMapOf<String, Int>()
        var answer: Int = 0

        for(input in gifts){
            val (give, get) = input.split(" ")
            giveMap.getOrPut(give){mutableListOf<String>()}.add(get)
            getMap.getOrPut(get){mutableListOf<String>()}.add(give)
        }

        for(name in friends){
            giftScoreMap[name] = giveMap.getOrPut(name){mutableListOf<String>()}.size - getMap.getOrPut(name){mutableListOf<String>()}.size
        }

        for(me in friends){
            var nextCnt = 0
            for(other in friends){
                if(other == me) continue
                val meCnt = giveMap[me]!!.count{ it == other }
                val otherCnt = giveMap[other]!!.count{ it == me }
                if(meCnt > otherCnt){
                    nextCnt++
                } else if(meCnt == otherCnt && giftScoreMap[me]!! > giftScoreMap[other]!!){
                    nextCnt++
                }
            }
            if(answer < nextCnt){
                answer = nextCnt
            }
        }
        return answer
    }
}