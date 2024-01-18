package com.example.alogrithems.programmers

fun main(){
    println(solution(arrayOf("classic", "pop", "classic", "classic", "pop"), intArrayOf(500, 600, 150, 800, 2500)).toList())
}

fun solution(genres: Array<String>, plays: IntArray): IntArray {
    return genres.indices.groupBy { genres[it] }
        .also { println("1 $it") }
        .toList()
        .also { println("2 $it") }
        .sortedByDescending { it.second.sumOf { plays[it] } }
        .also { println("3 $it") }
        .map { it.second.sortedByDescending { plays[it] }.take(2) }
        .also { println("4 $it") }
        .flatten().toList()
        .also { println("it") }
        .toIntArray()
}
//.sumOf{arr[it]}