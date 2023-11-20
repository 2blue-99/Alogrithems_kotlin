package com.example.alogrithems.test

/**
 * 2023-11-18
 * pureum
 */

fun main() {
    var original = "Hello, World!"

    // substring 사용
    var sub = original.substring(7, 12) // "World"

    println("Original: $original")
    println("Substring: $sub")

    // 부분 문자열 변경이 원본에 영향을 미침
    sub = sub.toUpperCase()
    println("After changing substring: $original")
}