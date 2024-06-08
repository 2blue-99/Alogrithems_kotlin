package com.blue.algorithem_kotlin.programmers


fun main(){
    val gap = personal_data().solution("2022.05.19",arrayOf("A 6", "B 12", "C 3"), arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"))
    println(gap.contentToString())
}

class personal_data {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = sortedSetOf<Int>()
        val termsMap = mutableMapOf<String, Int>()

        terms.forEach{
            val(name, term) = it.split(" ")
            termsMap[name] = term.toInt()
        }

        privacies.forEachIndexed(){ index, it ->
            val(date, name) = it.split(" ")
            var (y,m,d) = date.split(".").map{it.toInt()}
            m += termsMap[name]!!

            while(m>12){
                m -= 12
                y ++
            }

            d -= 1
            if(d==0){
                m--
                d=28
            }
            val nd = if(d.toString().length==1) "0$d" else "$d"
            val nm = if(m.toString().length==1) "0$m" else "$m"

            var gap = listOf(y,nm,nd).joinToString(".")
            if(today > gap) {
                answer.add(index+1)
            }
        }

        return answer.toIntArray()
    }
}