package com.example.alogrithems.programmers


class parking_fee {
    fun solution(fees: IntArray, records: Array<String>): IntArray {

        var tMap = mutableMapOf<String, Int>()
        val sMap = mutableMapOf<String, Pair<String, String>>()
        val result = mutableListOf<Int>()

        records.forEach{ it ->
            val (t, n, s) = it.split(" ")
            if(tMap[n]==null) tMap[n] = 0
            if(sMap[n]==null) sMap[n] = Pair(s, t)
            else{
                val inTime = sMap[n]!!.second.split(":")
                val outTime = t.split(":")

                val hour = outTime[0]!!.toInt() - inTime[0]!!.toInt()
                val minute = outTime[1]!!.toInt() - inTime[1]!!.toInt()

                tMap[n] = tMap[n]!! + hour*60 + minute
                sMap.remove(n)
            }
        }

        // 안나간 차 시간 계산
        sMap.forEach{
            val inTime = it.value.second.split(":")

            val hour = 23 - inTime[0].toInt()
            val minute = 59 - inTime[1].toInt()

            tMap[it.key] = tMap[it.key]!! + hour*60 + minute
        }

        val (baseTime, baseMoney, unitTime, unitMoney) = fees.joinToString(" ").split(" ").map{it.toDouble()}

        tMap.toList().sortedBy{it.first.toInt()}.toMap().forEach{
            val time = it.value
            if(time <= baseTime)
                result.add(baseMoney.toInt())
            else{
                if((time - baseTime) % unitTime != 0.0)
                    result.add((baseMoney + (Math.ceil((time - baseTime) / unitTime)) * unitMoney).toInt())
                else{
                    val gap = baseMoney + ((time - baseTime) / unitTime) * unitMoney
                    result.add(gap.toInt())
                }
            }
        }
        return result.toIntArray()
    }
}